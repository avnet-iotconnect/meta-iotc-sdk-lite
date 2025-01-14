LICENSE = "MIT"

SRC_URI = "https://saleshosted.z13.web.core.windows.net/sdk/python/iotconnect_sdk_lite-1.0.0-py3-none-any.whl"

S = "${WORKDIR}/${BPN}-${PV}"

inherit python3-dir

DEPENDS = "python3-pip-native"

RDEPENDS:${PN} += " python3"
RDEPENDS:${PN} += " python3-pip"

RDEPENDS:${PN} += " python3-ntplib"
RDEPENDS:${PN} += " python3-paho-mqtt"
RDEPENDS:${PN} += " python3-wheel"

distutils_do_configure () {
	# Specify any needed configure commands here
	:
}

distutils_do_compile () {
	# Specify compilation commands here
	:
}

distutils_do_install () {
	pip3 install iotconnect_sdk_lite-1.0.0-py3-none-any.whl
}
