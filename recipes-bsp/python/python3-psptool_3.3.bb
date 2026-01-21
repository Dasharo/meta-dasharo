SUMMARY = "PSPTool - display, extract and manipulate PSP firmware inside UEFI images"
HOMEPAGE = "https://github.com/PSPReverse/PSPTool"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5b4473596678d62d9d83096273422c8c"

# Build-time dependencies (fix missing pip issue)
DEPENDS += "python3-hatch-vcs-native"

PV = "3.3+git${SRCPV}"
SRC_URI = "git://github.com/PSPReverse/PSPTool.git;protocol=https;branch=master"
SRCREV = "9feb0300825e7a94123a6ceee3a5d43c26fdb19f"

S = "${WORKDIR}/git"

inherit python_hatchling

# Runtime dependencies
RDEPENDS:${PN} += " \
    python3 \
    python3-prettytable \
    python3-cryptography \
"
