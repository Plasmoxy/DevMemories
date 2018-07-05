#!/bin/bash

version=$(cat ./files/install/version.txt)

INSTALL_DIR=/usr/s3t-polivka

if [[ $EUID -ne 0 ]]; then
	echo "The install script must be run as root ! (sudo ./install)"
	exit 1
fi

echo "-- s3t-polivka installer by Sebp3t --"
echo "installing version : ${version}"

echo "installing in : ${INSTALL_DIR}"

echo "creating directories"
mkdir -p $INSTALL_DIR

echo "copying files"
cp -R ./files/install/* $INSTALL_DIR/

echo "owning ${INSTALL_DIR} to root recursively"
chown -R root $INSTALL_DIR

echo "copying s3t-polivka_setpath.sh to /etc/profile.d/"
cp ./files/s3t-polivka_setpath.sh /etc/profile.d/

echo "owning /etc/profile.d/s3t-polivka_setpath.sh to root"
chown root /etc/profile.d/s3t-polivka_setpath.sh

echo "changing permissions of /etc/profile.d/s3t-polivka_setpath.sh"
chmod 777 /etc/profile.d/s3t-polivka_setpath.sh

echo "changing permissions of commands in ${INSTALL_DIR}/bin"
chmod 777 $INSTALL_DIR/bin/*

echo "-- DONE INSTALLING --"

echo "If you have any problems with s3t-polivka, please contact me at sebohacker@gmail.com"
echo "REBOOT YOUR COMPUTER OR LOGOUT-LOGIN FOR THIS INSTALLATION TO TAKE EFFECT"
