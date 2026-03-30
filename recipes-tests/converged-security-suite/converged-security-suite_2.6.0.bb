SUMMARY = "Converged Security Suite's txt-suite"
HOMEPAGE = "https://github.com/9elements/converged-security-suite"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

SRC_URI = "https://github.com/9elements/converged-security-suite/releases/download/v2.6.0/txt-suite"
SRC_URI[sha256sum] = "1fc1ddae8369ae7938abaca797491b99f56d3f3acd5e951dc368c33482662eaa"

S = "${UNPACKDIR}"

do_install() {
    install -d ${D}${bindir}
    # install -m 0755 ${S}/amd-suite ${D}${bindir}
    # install -m 0755 ${S}/bg-prov ${D}${bindir}
    # install -m 0755 ${S}/bg-suite ${D}${bindir}
    # install -m 0755 ${S}/pcr0tool ${D}${bindir}
    # install -m 0755 ${S}/txt-prov ${D}${bindir}
    install -m 0755 ${S}/txt-suite ${D}${bindir}
}

PACKAGES =+ "${PN}-amd ${PN}-bg ${PN}-txt ${PN}-tools"

FILES:${PN}-amd += "${bindir}/amd-suite"
FILES:${PN}-bg += "${bindir}/bg-prov ${bindir}/bg-suite"
FILES:${PN}-txt += "${bindir}/txt-prov ${bindir}/txt-suite"
FILES:${PN}-tools += "${bindir}/pcr0tool"
