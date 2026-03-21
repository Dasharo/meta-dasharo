SUMMARY = "Converged Security Suite's txt-suite"
HOMEPAGE = "https://github.com/9elements/converged-security-suite"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

GO_IMPORT = "github.com/9elements/${BPN}"
GO_EXTRA_LDFLAGS:append = " -X main.gitcommit=${SRCREV} -X main.gittag=${PV}"

inherit go-mod

SRC_URI = " \
    git://${GO_IMPORT}.git;protocol=https;branch=main;destsuffix=${GO_SRCURI_DESTSUFFIX} \
"
SRCREV = "ba64392f925cee348bee70173b1286710e255fe2"

PACKAGES =+ "${PN}-amd ${PN}-bg ${PN}-txt ${PN}-tools"

FILES:${PN}-amd += "${bindir}/amd-suite"
FILES:${PN}-bg += "${bindir}/bg-prov ${bindir}/bg-suite"
FILES:${PN}-txt += "${bindir}/txt-prov ${bindir}/txt-suite"
FILES:${PN}-tools += "${bindir}/pcr0tool"
