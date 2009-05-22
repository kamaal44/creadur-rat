package org.apache.rat.report.claim.impl;

import org.apache.rat.document.IDocument;
import org.apache.rat.report.claim.LicenseFamilyCode;
import org.apache.rat.report.claim.LicenseFamilyName;


/**
 * Implementation of claim, which is used to report that
 * the subjects header indicate a particular license family.
 */
public class LicenseFamilyClaim extends AbstractClaim {
    private final LicenseFamilyName licenseFamilyName;
    private final LicenseFamilyCode code;

    /**
     * Creates a new instance with the given subject and
     * the given license family name.
     */
    public LicenseFamilyClaim(IDocument pSubject, LicenseFamilyName pName,
            LicenseFamilyCode pCode) {
        super(pSubject);
        licenseFamilyName = pName;
        this.code = pCode;
    }

    public LicenseFamilyCode getCode() {
        return code;
    }
    
    /**
     * Returns the license family name.
     */
    public LicenseFamilyName getLicenseFamilyName() {
        return licenseFamilyName;
    }
}
