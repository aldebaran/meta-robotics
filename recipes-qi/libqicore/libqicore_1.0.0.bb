DESCRIPTION = "QiCore project"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://python-qicore/LICENSE.txt;md5=446dfcc5e987465f24997263daae34e4"

SRC_URI = "git://git@github.com/aldebaran/libqicore.git;protocol=https;branch=master"

PV = "1.0.0"
SRCREV = "985b636bff98d792d72b3cd2e0a1480abfe62d8b"

S = "${WORKDIR}/git"

DEPENDS = "libqi"

inherit cmake

BBCLASSEXTEND = "native nativesdk"

EXTRA_OECMAKE = "-DBUILD_TESTING=OFF"
EXTRA_OECMAKE:class-native = "-DBUILD_TESTING=ON"

