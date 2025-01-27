LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SRC_URI = "git://git@github.com/avnet-iotconnect/iotc-python-lite-sdk.git;protocol=ssh;branch=main"
SRCREV = "f0b5bf006b716d2de361e3df8b94f684f9872497"
S = "${WORKDIR}/git"

inherit setuptools3

do_configure:prepend() {
cat > ${S}/setup.py <<-EOF
from setuptools import setup

setup()
EOF
}
 
