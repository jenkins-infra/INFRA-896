Script used to fudge access log to clean up the mess of [INFRA-896](https://issues.jenkins-ci.org/browse/INFRA-896)

Put original log files in the 'input' directory, then create empty 'out' directory and run `./run.sh`.
You get fudged files in the 'out' directory in the end.
