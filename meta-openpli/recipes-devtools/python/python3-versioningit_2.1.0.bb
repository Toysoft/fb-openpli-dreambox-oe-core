SUMMARY = "Versioning It with your Version In Git"
HOMEPAGE = "https://github.com/jwodder/versioningit"
AUTHOR = "John Thorvald Wodder II <versioningit@varonathe.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c9c2eb279b50fd56de7da07a66d0032f"

DEPENDS += "${PYTHON_PN}-setuptools-scm-native"

RDEPENDS:${PN} += "${PYTHON_PN}-packaging ${PYTHON_PN}-tomli"

SRC_URI[sha256sum] = "73f2965e30d2ebfd7ffab6bf26368f2237570622dd2a49c7fbc1995de9c676d6"

PYPI_PACKAGE = "versioningit"

inherit pypi python_setuptools_build_meta

require ${PYTHON_PN}-package-split.inc

FILES:${PN}-src += "${bindir}/versioningit"

BBCLASSEXTEND = "native"
