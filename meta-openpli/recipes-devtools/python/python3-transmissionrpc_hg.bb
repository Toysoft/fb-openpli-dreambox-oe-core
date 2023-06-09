DESCRIPTION = "Transmission RPC is a python module that can communicate with the bittorrent client Transmission through json-rpc"
HOMEPAGE = "http://bitbucket.org/blueluna/transmissionrpc/wiki/Home"
SECTION = "devel/python"
PRIORITY = "optional"
LICENSE = "MIT"
RDEPENDS:${PN} = "python3-simplejson"
PV = "0.7+hg${SRCREV}"

SRC_URI = "hg://bitbucket.org/blueluna;protocol=http;module=transmissionrpc;rev=${SRCREV}"

S = "${WORKDIR}/transmissionrpc"

inherit setuptools3

include ${PYTHON_PN}-package-split.inc
