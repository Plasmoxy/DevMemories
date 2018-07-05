#!/bin/bash

if [[ $EUID -ne 0 ]]; then
	echo "need root"
	exit 1
fi

if [[ "$1" = "" ]]; then
	exit 1
fi

tar -cv -f ./product/s3t-polivka-${1}.tar ./s3t-polivka-installer/*
chmod 666 ./product/s3t-polivka-${1}.tar
