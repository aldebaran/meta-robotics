DESCRIPTION = "libQiPython - libQi Python bindings"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=15e99fe8778e507d1f60e56085cdb713"

SRC_URI = "git://github.com/aldebaran/libqi-python.git;protocol=https;branch=master"

PV = "3.1.4"
SRCREV = "ea58ec47f97f2051fb3c28a6f24a7fffbd2ed2a8"

S = "${WORKDIR}/git"

inherit cmake python3-dir python3native

DEPENDS = "libqi boost python3-pybind11"

EXTRA_OECMAKE= "--install-prefix ${PYTHON_SITEPACKAGES_DIR}"

FILES:${PN} += " \
  ${PYTHON_SITEPACKAGES_DIR}/qi/path.py \
  ${PYTHON_SITEPACKAGES_DIR}/qi/__init__.py \
  ${PYTHON_SITEPACKAGES_DIR}/qi/translator.py \
  ${PYTHON_SITEPACKAGES_DIR}/qi/native.py \
  ${PYTHON_SITEPACKAGES_DIR}/qi/qi_python.so \
  ${PYTHON_SITEPACKAGES_DIR}/qi/_version.py \
  ${PYTHON_SITEPACKAGES_DIR}/qi/logging.py \
  ${PYTHON_SITEPACKAGES_DIR}/qi/_binder.py \
  ${PYTHON_SITEPACKAGES_DIR}/qi/_type.py \
  "
