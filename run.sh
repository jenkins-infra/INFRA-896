#!/bin/bash -ex
rm out/* || true
gunzip -c input/access.log.*.gz | groovy fudge.groovy out/access.log.
gunzip -c input/access_nonssl.log.*.gz | groovy fudge.groovy out/access_nonssl.log.
