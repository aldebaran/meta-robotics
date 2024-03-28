DESCRIPTION = "The libQi project"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=437313cd2fbe102775c350178aa9d75b"

SRC_URI = "git://github.com/aldebaran/libqi.git;protocol=https;branch=master"

PV = "4.0.3"
SRCREV = "aa9c89afdbe555668a578c2f83b7ddd78a4c8d25"

S = "${WORKDIR}/git"

DEPENDS = "boost openssl systemd googletest pkgconfig-native"
DEPENDS:remove:class-native = "systemd pkgconfig-native"
DEPENDS:remove:class-nativesdk = "systemd pkgconfig-native googletest"

inherit cmake

BBCLASSEXTEND = "native nativesdk"

EXTRA_OECMAKE = "-DBUILD_EXAMPLES=ON -DBUILD_TESTING=ON -DWITH_SYSTEMD=ON"
EXTRA_OECMAKE:remove:class-native = "-DWITH_SYSTEMD=ON"
EXTRA_OECMAKE:class-nativesdk = "-DBUILD_EXAMPLES=OFF -DBUILD_TESTING=OFF"
