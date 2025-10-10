SUMMARY = "PSPTool - display, extract and manipulate PSP firmware inside UEFI images"
HOMEPAGE = "https://github.com/PSPReverse/PSPTool"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5b4473596678d62d9d83096273422c8c"

# Build-time dependencies (fix missing pip issue)
DEPENDS += "python3-setuptools-scm-native"

PV = "3.0+git${SRCPV}"
SRC_URI = "git://github.com/PSPReverse/PSPTool.git;protocol=https;branch=master"
SRCREV = "c228c009fa3f86c06bf0f173a8193aa2d2db4d57"

S = "${WORKDIR}/git"

inherit setuptools3

# Runtime dependencies
RDEPENDS:${PN} += " \
    python3 \
    python3-prettytable \
    python3-cryptography \
    python3-setuptools \
"
