DESCRIPTION = "QiLang project"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://README.rst;md5=e895c2c5a98cf86da6c68265a8a12b1c"

SRC_URI = "git://git@github.com/aldebaran/qilang.git;protocol=https;branch=master"

PV = "1.0.1"
SRCREV = "18bc011efd5f0c8a17f2e8caa7db30dd3e14552a"

S = "${WORKDIR}/git"

DEPENDS = "flex-native bison-native boost libqi"
DEPENDS:class-native = "flex-native bison-native boost libqi googletest"

inherit cmake

BBCLASSEXTEND = "native nativesdk"

EXTRA_OECMAKE = " -DBUILD_TESTING=OFF"
EXTRA_OECMAKE:class-native = " -DBUILD_TESTING=ON"
EXTRA_OECMAKE:class-nativesdk = " -DBUILD_TESTING=OFF"
