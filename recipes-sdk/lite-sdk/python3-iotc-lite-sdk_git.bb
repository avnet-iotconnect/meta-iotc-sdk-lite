DESCRIPTION = "IoTConnect Python Lite SDK"
HOMEPAGE = "https://github.com/avnet-iotconnect/iotc-python-lite-sdk"
LICENSE = "CLOSED"
SRC_URI = "git://github.com/avnet-iotconnect/iotc-python-lite-sdk.git;protocol=https;branch=main"
SRCREV = "f0b5bf006b716d2de361e3df8b94f684f9872497"
S = "${WORKDIR}/git"

PYPI_PACKAGE = "iotc-python-lite-sdk"

inherit setuptools3 pypi

do_configure:prepend() {
cat > ${S}/setup.py <<-EOF
from setuptools import setup

setup(
       name="${PYPI_PACKAGE}",
       version="${PV}",
       license="${LICENSE}",
)
EOF
}
 
