Script used to fudge access log to clean up the mess of [INFRA-896](https://issues.jenkins-ci.org/browse/INFRA-896)

Put original log files in the 'input' directory, then create empty 'out' directory and run `./run.sh`.
You get fudged files in the 'out' directory in the end.

The actual run of this is in `usage.jenkins.io:/srv/usage/INFRA-896`

# Record of Execution

## Input
```
root@usage:/srv/usage/INFRA-896# ls -la input/
total 3679232
drwxr-xr-x 2 root root      4096 Aug 18 00:56 .
drwxr-xr-x 5 root root      4096 Aug 18 01:11 ..
-rw-r--r-- 1 root root  88611424 Aug 18 00:52 access.log.20160601000000.gz
-rw-r--r-- 1 root root  88365458 Aug 18 00:52 access.log.20160602000000.1.gz
-rw-r--r-- 1 root root  15978451 Aug 18 00:52 access.log.20160602000000.gz
-rw-r--r-- 1 root root  35193620 Aug 18 00:52 access.log.20160609000000.gz
-rw-r--r-- 1 root root  75720971 Aug 18 00:52 access.log.20160616000000.gz
-rw-r--r-- 1 root root  94387225 Aug 18 00:52 access.log.20160623000000.gz
-rw-r--r-- 1 root root  99519727 Aug 18 00:52 access.log.20160630000000.gz
-rw-r--r-- 1 root root 112691988 Aug 18 00:53 access.log.20160707000000.gz
-rw-r--r-- 1 root root 122333705 Aug 18 00:53 access.log.20160714000000.gz
-rw-r--r-- 1 root root 152157755 Aug 18 00:53 access.log.20160721000000.gz
-rw-r--r-- 1 root root 154637922 Aug 18 00:53 access.log.20160728000000.gz
-rw-r--r-- 1 root root 180350261 Aug 18 00:54 access.log.20160804000000.gz
-rw-r--r-- 1 root root 196770735 Aug 18 00:54 access.log.20160811000000.gz
-rw-r--r-- 1 root root    547416 Aug 18 00:54 access.log.20160817000000.gz
-rw-r--r-- 1 root root 106742573 Aug 18 00:52 access_nonssl.log.20160602000000.gz
-rw-r--r-- 1 root root 163931341 Aug 18 00:52 access_nonssl.log.20160609000000.gz
-rw-r--r-- 1 root root 154881470 Aug 18 00:52 access_nonssl.log.20160616000000.gz
-rw-r--r-- 1 root root 148671275 Aug 18 00:52 access_nonssl.log.20160623000000.gz
-rw-r--r-- 1 root root 138483049 Aug 18 00:52 access_nonssl.log.20160630000000.gz
-rw-r--r-- 1 root root 141774756 Aug 18 00:53 access_nonssl.log.20160707000000.gz
-rw-r--r-- 1 root root 189792260 Aug 18 00:53 access_nonssl.log.20160714000000.gz
-rw-r--r-- 1 root root 347533719 Aug 18 00:53 access_nonssl.log.20160721000000.gz
-rw-r--r-- 1 root root 343804240 Aug 18 00:54 access_nonssl.log.20160728000000.gz
-rw-r--r-- 1 root root 327450507 Aug 18 00:54 access_nonssl.log.20160804000000.gz
-rw-r--r-- 1 root root 286400511 Aug 18 00:54 access_nonssl.log.20160811000000.gz
-rw-r--r-- 1 root root    687701 Aug 18 00:54 access_nonssl.log.20160817000000.gz
```

## Output
```
root@usage:/srv/usage/INFRA-896# ls -la out/
total 3685100
drwxr-xr-x 2 root root    12288 Aug 18 01:32 .
drwxr-xr-x 5 root root     4096 Aug 18 01:27 ..
-rw-r--r-- 1 root root 88751037 Aug 18 01:27 access.log.20160601000000.fudged.gz
-rw-r--r-- 1 root root 88503592 Aug 18 01:27 access.log.20160602000000.fudged.gz
-rw-r--r-- 1 root root  1292892 Aug 18 01:27 access.log.20160604000000.fudged.gz
-rw-r--r-- 1 root root  1269892 Aug 18 01:27 access.log.20160605000000.fudged.gz
-rw-r--r-- 1 root root  4641370 Aug 18 01:27 access.log.20160606000000.fudged.gz
-rw-r--r-- 1 root root  4365911 Aug 18 01:27 access.log.20160607000000.fudged.gz
-rw-r--r-- 1 root root  4430721 Aug 18 01:27 access.log.20160608000000.fudged.gz
-rw-r--r-- 1 root root  4251464 Aug 18 01:27 access.log.20160609000000.fudged.gz
-rw-r--r-- 1 root root  4225956 Aug 18 01:27 access.log.20160610000000.fudged.gz
-rw-r--r-- 1 root root  1356744 Aug 18 01:27 access.log.20160611000000.fudged.gz
-rw-r--r-- 1 root root  1465760 Aug 18 01:27 access.log.20160612000000.fudged.gz
-rw-r--r-- 1 root root  4911142 Aug 18 01:27 access.log.20160613000000.fudged.gz
-rw-r--r-- 1 root root  8212683 Aug 18 01:27 access.log.20160614000000.fudged.gz
-rw-r--r-- 1 root root 10823109 Aug 18 01:27 access.log.20160615000000.fudged.gz
-rw-r--r-- 1 root root 11816360 Aug 18 01:27 access.log.20160616000000.fudged.gz
-rw-r--r-- 1 root root 11373498 Aug 18 01:27 access.log.20160617000000.fudged.gz
-rw-r--r-- 1 root root  3255517 Aug 18 01:27 access.log.20160618000000.fudged.gz
-rw-r--r-- 1 root root  3774636 Aug 18 01:27 access.log.20160619000000.fudged.gz
-rw-r--r-- 1 root root 14570273 Aug 18 01:27 access.log.20160620000000.fudged.gz
-rw-r--r-- 1 root root 15389945 Aug 18 01:27 access.log.20160621000000.fudged.gz
-rw-r--r-- 1 root root 15657523 Aug 18 01:27 access.log.20160622000000.fudged.gz
-rw-r--r-- 1 root root 16002260 Aug 18 01:27 access.log.20160623000000.fudged.gz
-rw-r--r-- 1 root root 14220848 Aug 18 01:27 access.log.20160624000000.fudged.gz
-rw-r--r-- 1 root root  4380948 Aug 18 01:27 access.log.20160625000000.fudged.gz
-rw-r--r-- 1 root root  4768342 Aug 18 01:27 access.log.20160626000000.fudged.gz
-rw-r--r-- 1 root root 18197929 Aug 18 01:27 access.log.20160627000000.fudged.gz
-rw-r--r-- 1 root root 18603195 Aug 18 01:27 access.log.20160628000000.fudged.gz
-rw-r--r-- 1 root root 18356720 Aug 18 01:27 access.log.20160629000000.fudged.gz
-rw-r--r-- 1 root root 18526689 Aug 18 01:27 access.log.20160630000000.fudged.gz
-rw-r--r-- 1 root root 16138411 Aug 18 01:27 access.log.20160701000000.fudged.gz
-rw-r--r-- 1 root root  4757672 Aug 18 01:27 access.log.20160702000000.fudged.gz
-rw-r--r-- 1 root root  4873962 Aug 18 01:27 access.log.20160703000000.fudged.gz
-rw-r--r-- 1 root root 16274252 Aug 18 01:27 access.log.20160704000000.fudged.gz
-rw-r--r-- 1 root root 19434388 Aug 18 01:27 access.log.20160705000000.fudged.gz
-rw-r--r-- 1 root root 19664070 Aug 18 01:27 access.log.20160706000000.fudged.gz
-rw-r--r-- 1 root root 19845643 Aug 18 01:28 access.log.20160707000000.fudged.gz
-rw-r--r-- 1 root root 18540143 Aug 18 01:28 access.log.20160708000000.fudged.gz
-rw-r--r-- 1 root root  5360819 Aug 18 01:28 access.log.20160709000000.fudged.gz
-rw-r--r-- 1 root root  5714000 Aug 18 01:28 access.log.20160710000000.fudged.gz
-rw-r--r-- 1 root root 21780883 Aug 18 01:28 access.log.20160711000000.fudged.gz
-rw-r--r-- 1 root root 21216975 Aug 18 01:28 access.log.20160712000000.fudged.gz
-rw-r--r-- 1 root root 20402317 Aug 18 01:28 access.log.20160713000000.fudged.gz
-rw-r--r-- 1 root root 20554023 Aug 18 01:28 access.log.20160714000000.fudged.gz
-rw-r--r-- 1 root root 18779552 Aug 18 01:28 access.log.20160715000000.fudged.gz
-rw-r--r-- 1 root root  5294776 Aug 18 01:28 access.log.20160716000000.fudged.gz
-rw-r--r-- 1 root root  5290208 Aug 18 01:28 access.log.20160717000000.fudged.gz
-rw-r--r-- 1 root root 21140843 Aug 18 01:28 access.log.20160718000000.fudged.gz
-rw-r--r-- 1 root root 24176425 Aug 18 01:28 access.log.20160719000000.fudged.gz
-rw-r--r-- 1 root root 27280580 Aug 18 01:28 access.log.20160720000000.fudged.gz
-rw-r--r-- 1 root root 27034333 Aug 18 01:28 access.log.20160721000000.fudged.gz
-rw-r--r-- 1 root root 24789234 Aug 18 01:28 access.log.20160722000000.fudged.gz
-rw-r--r-- 1 root root  6879215 Aug 18 01:28 access.log.20160723000000.fudged.gz
-rw-r--r-- 1 root root  7687346 Aug 18 01:28 access.log.20160724000000.fudged.gz
-rw-r--r-- 1 root root 29025450 Aug 18 01:28 access.log.20160725000000.fudged.gz
-rw-r--r-- 1 root root 28491873 Aug 18 01:28 access.log.20160726000000.fudged.gz
-rw-r--r-- 1 root root 28477655 Aug 18 01:28 access.log.20160727000000.fudged.gz
-rw-r--r-- 1 root root 28053249 Aug 18 01:28 access.log.20160728000000.fudged.gz
-rw-r--r-- 1 root root 25483132 Aug 18 01:28 access.log.20160729000000.fudged.gz
-rw-r--r-- 1 root root  6860432 Aug 18 01:28 access.log.20160730000000.fudged.gz
-rw-r--r-- 1 root root  7373083 Aug 18 01:28 access.log.20160731000000.fudged.gz
-rw-r--r-- 1 root root 29001595 Aug 18 01:28 access.log.20160801000000.fudged.gz
-rw-r--r-- 1 root root 29823914 Aug 18 01:28 access.log.20160802000000.fudged.gz
-rw-r--r-- 1 root root 28273539 Aug 18 01:28 access.log.20160803000000.fudged.gz
-rw-r--r-- 1 root root 28566588 Aug 18 01:28 access.log.20160804000000.fudged.gz
-rw-r--r-- 1 root root 28231687 Aug 18 01:28 access.log.20160805000000.fudged.gz
-rw-r--r-- 1 root root  8894518 Aug 18 01:28 access.log.20160806000000.fudged.gz
-rw-r--r-- 1 root root  8837090 Aug 18 01:28 access.log.20160807000000.fudged.gz
-rw-r--r-- 1 root root 34798073 Aug 18 01:28 access.log.20160808000000.fudged.gz
-rw-r--r-- 1 root root 35340670 Aug 18 01:29 access.log.20160809000000.fudged.gz
-rw-r--r-- 1 root root 35950099 Aug 18 01:29 access.log.20160810000000.fudged.gz
-rw-r--r-- 1 root root 35219618 Aug 18 01:29 access.log.20160811000000.fudged.gz
-rw-r--r-- 1 root root 32845438 Aug 18 01:29 access.log.20160812000000.fudged.gz
-rw-r--r-- 1 root root  9275371 Aug 18 01:29 access.log.20160813000000.fudged.gz
-rw-r--r-- 1 root root  9806530 Aug 18 01:29 access.log.20160814000000.fudged.gz
-rw-r--r-- 1 root root 33186314 Aug 18 01:29 access.log.20160815000000.fudged.gz
-rw-r--r-- 1 root root 39134645 Aug 18 01:29 access.log.20160816000000.fudged.gz
-rw-r--r-- 1 root root 38143145 Aug 18 01:29 access.log.20160817000000.fudged.gz
-rw-r--r-- 1 root root      196 Aug 18 01:29 access_nonssl.log.20160603000000.fudged.gz
-rw-r--r-- 1 root root  7281000 Aug 18 01:29 access_nonssl.log.20160604000000.fudged.gz
-rw-r--r-- 1 root root  6946222 Aug 18 01:29 access_nonssl.log.20160605000000.fudged.gz
-rw-r--r-- 1 root root 31220525 Aug 18 01:29 access_nonssl.log.20160606000000.fudged.gz
-rw-r--r-- 1 root root 31236723 Aug 18 01:29 access_nonssl.log.20160607000000.fudged.gz
-rw-r--r-- 1 root root 30224829 Aug 18 01:29 access_nonssl.log.20160608000000.fudged.gz
-rw-r--r-- 1 root root 25986088 Aug 18 01:29 access_nonssl.log.20160609000000.fudged.gz
-rw-r--r-- 1 root root 24853958 Aug 18 01:29 access_nonssl.log.20160610000000.fudged.gz
-rw-r--r-- 1 root root  6246751 Aug 18 01:29 access_nonssl.log.20160611000000.fudged.gz
-rw-r--r-- 1 root root 10880134 Aug 18 01:29 access_nonssl.log.20160612000000.fudged.gz
-rw-r--r-- 1 root root 32856530 Aug 18 01:29 access_nonssl.log.20160613000000.fudged.gz
-rw-r--r-- 1 root root 32497967 Aug 18 01:29 access_nonssl.log.20160614000000.fudged.gz
-rw-r--r-- 1 root root 30867561 Aug 18 01:29 access_nonssl.log.20160615000000.fudged.gz
-rw-r--r-- 1 root root 29199185 Aug 18 01:29 access_nonssl.log.20160616000000.fudged.gz
-rw-r--r-- 1 root root 25720089 Aug 18 01:29 access_nonssl.log.20160617000000.fudged.gz
-rw-r--r-- 1 root root  6053672 Aug 18 01:29 access_nonssl.log.20160618000000.fudged.gz
-rw-r--r-- 1 root root  6832893 Aug 18 01:29 access_nonssl.log.20160619000000.fudged.gz
-rw-r--r-- 1 root root 29550656 Aug 18 01:29 access_nonssl.log.20160620000000.fudged.gz
-rw-r--r-- 1 root root 29717031 Aug 18 01:29 access_nonssl.log.20160621000000.fudged.gz
-rw-r--r-- 1 root root 28051963 Aug 18 01:29 access_nonssl.log.20160622000000.fudged.gz
-rw-r--r-- 1 root root 27580870 Aug 18 01:30 access_nonssl.log.20160623000000.fudged.gz
-rw-r--r-- 1 root root 24060279 Aug 18 01:30 access_nonssl.log.20160624000000.fudged.gz
-rw-r--r-- 1 root root  5981475 Aug 18 01:30 access_nonssl.log.20160625000000.fudged.gz
-rw-r--r-- 1 root root  6494104 Aug 18 01:30 access_nonssl.log.20160626000000.fudged.gz
-rw-r--r-- 1 root root 28592013 Aug 18 01:30 access_nonssl.log.20160627000000.fudged.gz
-rw-r--r-- 1 root root 28176873 Aug 18 01:30 access_nonssl.log.20160628000000.fudged.gz
-rw-r--r-- 1 root root 28020716 Aug 18 01:30 access_nonssl.log.20160629000000.fudged.gz
-rw-r--r-- 1 root root 27142099 Aug 18 01:30 access_nonssl.log.20160630000000.fudged.gz
-rw-r--r-- 1 root root 23922770 Aug 18 01:30 access_nonssl.log.20160701000000.fudged.gz
-rw-r--r-- 1 root root  5607017 Aug 18 01:30 access_nonssl.log.20160702000000.fudged.gz
-rw-r--r-- 1 root root  5729392 Aug 18 01:30 access_nonssl.log.20160703000000.fudged.gz
-rw-r--r-- 1 root root 23793728 Aug 18 01:30 access_nonssl.log.20160704000000.fudged.gz
-rw-r--r-- 1 root root 27094495 Aug 18 01:30 access_nonssl.log.20160705000000.fudged.gz
-rw-r--r-- 1 root root 25409935 Aug 18 01:30 access_nonssl.log.20160706000000.fudged.gz
-rw-r--r-- 1 root root 25148682 Aug 18 01:30 access_nonssl.log.20160707000000.fudged.gz
-rw-r--r-- 1 root root 23799301 Aug 18 01:30 access_nonssl.log.20160708000000.fudged.gz
-rw-r--r-- 1 root root  5435135 Aug 18 01:30 access_nonssl.log.20160709000000.fudged.gz
-rw-r--r-- 1 root root  6416309 Aug 18 01:30 access_nonssl.log.20160710000000.fudged.gz
-rw-r--r-- 1 root root 27588948 Aug 18 01:30 access_nonssl.log.20160711000000.fudged.gz
-rw-r--r-- 1 root root 27492774 Aug 18 01:30 access_nonssl.log.20160712000000.fudged.gz
-rw-r--r-- 1 root root 26115404 Aug 18 01:30 access_nonssl.log.20160713000000.fudged.gz
-rw-r--r-- 1 root root 25967365 Aug 18 01:30 access_nonssl.log.20160714000000.fudged.gz
-rw-r--r-- 1 root root 24438749 Aug 18 01:30 access_nonssl.log.20160715000000.fudged.gz
-rw-r--r-- 1 root root  5861229 Aug 18 01:30 access_nonssl.log.20160716000000.fudged.gz
-rw-r--r-- 1 root root  6021402 Aug 18 01:30 access_nonssl.log.20160717000000.fudged.gz
-rw-r--r-- 1 root root 26439063 Aug 18 01:30 access_nonssl.log.20160718000000.fudged.gz
-rw-r--r-- 1 root root 37229861 Aug 18 01:30 access_nonssl.log.20160719000000.fudged.gz
-rw-r--r-- 1 root root 64129457 Aug 18 01:30 access_nonssl.log.20160720000000.fudged.gz
-rw-r--r-- 1 root root 64216856 Aug 18 01:31 access_nonssl.log.20160721000000.fudged.gz
-rw-r--r-- 1 root root 57928493 Aug 18 01:31 access_nonssl.log.20160722000000.fudged.gz
-rw-r--r-- 1 root root 13810753 Aug 18 01:31 access_nonssl.log.20160723000000.fudged.gz
-rw-r--r-- 1 root root 14670737 Aug 18 01:31 access_nonssl.log.20160724000000.fudged.gz
-rw-r--r-- 1 root root 66673782 Aug 18 01:31 access_nonssl.log.20160725000000.fudged.gz
-rw-r--r-- 1 root root 66420122 Aug 18 01:31 access_nonssl.log.20160726000000.fudged.gz
-rw-r--r-- 1 root root 64348779 Aug 18 01:31 access_nonssl.log.20160727000000.fudged.gz
-rw-r--r-- 1 root root 63772033 Aug 18 01:31 access_nonssl.log.20160728000000.fudged.gz
-rw-r--r-- 1 root root 57482570 Aug 18 01:31 access_nonssl.log.20160729000000.fudged.gz
-rw-r--r-- 1 root root 13572337 Aug 18 01:31 access_nonssl.log.20160730000000.fudged.gz
-rw-r--r-- 1 root root 14978708 Aug 18 01:31 access_nonssl.log.20160731000000.fudged.gz
-rw-r--r-- 1 root root 65070981 Aug 18 01:31 access_nonssl.log.20160801000000.fudged.gz
-rw-r--r-- 1 root root 64938626 Aug 18 01:31 access_nonssl.log.20160802000000.fudged.gz
-rw-r--r-- 1 root root 64518390 Aug 18 01:31 access_nonssl.log.20160803000000.fudged.gz
-rw-r--r-- 1 root root 63782393 Aug 18 01:32 access_nonssl.log.20160804000000.fudged.gz
-rw-r--r-- 1 root root 55873620 Aug 18 01:32 access_nonssl.log.20160805000000.fudged.gz
-rw-r--r-- 1 root root 12595514 Aug 18 01:32 access_nonssl.log.20160806000000.fudged.gz
-rw-r--r-- 1 root root 13575109 Aug 18 01:32 access_nonssl.log.20160807000000.fudged.gz
-rw-r--r-- 1 root root 62779464 Aug 18 01:32 access_nonssl.log.20160808000000.fudged.gz
-rw-r--r-- 1 root root 60499146 Aug 18 01:32 access_nonssl.log.20160809000000.fudged.gz
-rw-r--r-- 1 root root 58849234 Aug 18 01:32 access_nonssl.log.20160810000000.fudged.gz
-rw-r--r-- 1 root root 54720922 Aug 18 01:32 access_nonssl.log.20160811000000.fudged.gz
-rw-r--r-- 1 root root 50040922 Aug 18 01:32 access_nonssl.log.20160812000000.fudged.gz
-rw-r--r-- 1 root root 11552853 Aug 18 01:32 access_nonssl.log.20160813000000.fudged.gz
-rw-r--r-- 1 root root 11702867 Aug 18 01:32 access_nonssl.log.20160814000000.fudged.gz
-rw-r--r-- 1 root root 46927755 Aug 18 01:32 access_nonssl.log.20160815000000.fudged.gz
-rw-r--r-- 1 root root 56646850 Aug 18 01:32 access_nonssl.log.20160816000000.fudged.gz
-rw-r--r-- 1 root root 55939361 Aug 18 01:32 access_nonssl.log.20160817000000.fudged.gz

```
## Verification
```
root@usage:/srv/usage/INFRA-896# gunzip -c input/*.gz | wc -l
3853958
root@usage:/srv/usage/INFRA-896# gunzip -c out/*.gz | wc -l
3853958
```
