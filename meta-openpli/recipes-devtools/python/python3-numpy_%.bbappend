do_install:prepend() {
    mkdir -p ${D}${PYTHON_SITEPACKAGES_DIR}/numpy/typing/tests/data/pass/__pycache__
    touch ${D}${PYTHON_SITEPACKAGES_DIR}/numpy/typing/tests/data/pass/__pycache__/literal.cpython
}

include ${PYTHON_PN}-package-split.inc
