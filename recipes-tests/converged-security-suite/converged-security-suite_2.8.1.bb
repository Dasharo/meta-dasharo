SUMMARY = "Converged Security Suite's txt-suite"
HOMEPAGE = "https://github.com/9elements/converged-security-suite"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

SRC_URI = "https://github.com/9elements/${BPN}/releases/download/v${PV}/artifacts-amd64.zip"
SRC_URI[sha256sum] = "58362a5976e68c31e20ecd34338683826c920bb2f34c717dd693aecbb1f7db3d"

S = "${UNPACKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/amd-suite ${D}${bindir}
    install -m 0755 ${S}/bg-prov ${D}${bindir}
    install -m 0755 ${S}/bg-suite ${D}${bindir}
    install -m 0755 ${S}/pcr0tool ${D}${bindir}
    install -m 0755 ${S}/txt-prov ${D}${bindir}
    install -m 0755 ${S}/txt-suite ${D}${bindir}
}

PACKAGES =+ "${PN}-amd ${PN}-bg ${PN}-txt ${PN}-tools"

FILES:${PN}-amd += "${bindir}/amd-suite"
FILES:${PN}-bg += "${bindir}/bg-prov ${bindir}/bg-suite"
FILES:${PN}-txt += "${bindir}/txt-prov ${bindir}/txt-suite"
FILES:${PN}-tools += "${bindir}/pcr0tool"
