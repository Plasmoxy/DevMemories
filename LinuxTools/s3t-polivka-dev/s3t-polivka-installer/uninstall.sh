#!/bin/bash

if [[ $EUID -ne 0 ]]; then
	echo "You must be running this script as root ! (sudo ./uninstall)"
	exit 1
fi

INSTALL_DIR=/usr/s3t-polivka

echo "-- s3t-polivka uninstall script by Sebp3t --"

echo "removing /etc/profile.d/s3t-polivka_setpath.sh"
rm /etc/profile.d/s3t-polivka_setpath.sh
echo "removing /usr/s3t-polivka recursively"
rm -r /usr/s3t-polivka

echo "-- DONE UNINSTALLING --"
