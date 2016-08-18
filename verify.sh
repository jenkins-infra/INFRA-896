#!/bin/bash -x
gunzip -c input/*.gz | wc -l
gunzip -c out/*.gz | wc -l
