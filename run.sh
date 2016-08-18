#!/bin/bash -ex
rm out/* || true
for prefix in access access_nonssl;
do
  gunzip -c input/$prefix.log.*.gz | groovy fudge.groovy out/$prefix.log.
done