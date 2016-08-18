import java.text.*;
import java.util.zip.*;

// 1.2.3.4 - - [04/Jun/2016:00:27:51 +0000] "GET / HTTP/1.1" 200 360 "-" "Mozilla/5.0 (Windows NT 6.1; rv:45.0) Gecko/20100101 Firefox/45.0"


def format = new SimpleDateFormat("dd/MMM/yyyy");
def of = new SimpleDateFormat("yyyyMMdd");

def o = null;   // output stream to write data to
def prev = "";

System.in.eachLine { l ->
    try {
        def dt = l.split("[\\[\\]]")[1] // extract [04/Jun/2016:00:27:51 +0000] part
            dt = dt.split(":")[0]
            dt = format.parse(dt)
            def cur = of.format(dt) // yyyyMMdd form of the current date
            if (cur!=prev) {
                o?.close();
                o = new PrintWriter(new OutputStreamWriter(new GZIPOutputStream(new FileOutputStream("access.log."+cur+"000000.fudged.gz"))))
                    prev = cur
            }
        o.println(l);
    } catch (Exception e) {
        System.err.println(l);
        throw e;
    }
}

o?.close();

