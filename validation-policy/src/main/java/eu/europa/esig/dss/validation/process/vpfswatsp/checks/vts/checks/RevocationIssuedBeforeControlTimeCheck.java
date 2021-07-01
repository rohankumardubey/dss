package eu.europa.esig.dss.validation.process.vpfswatsp.checks.vts.checks;

import eu.europa.esig.dss.detailedreport.jaxb.XmlVTS;
import eu.europa.esig.dss.diagnostic.RevocationWrapper;
import eu.europa.esig.dss.enumerations.Indication;
import eu.europa.esig.dss.enumerations.SubIndication;
import eu.europa.esig.dss.i18n.I18nProvider;
import eu.europa.esig.dss.i18n.MessageTag;
import eu.europa.esig.dss.policy.jaxb.LevelConstraint;
import eu.europa.esig.dss.validation.process.ChainItem;
import eu.europa.esig.dss.validation.process.ValidationProcessUtils;

import java.util.Date;

/**
 * This class verifies if the issuance date of the revocation status information is before control time
 *
 */
public class RevocationIssuedBeforeControlTimeCheck extends ChainItem<XmlVTS> {

    /** Revocation data to check */
    private final RevocationWrapper revocation;

    /** The control time */
    private final Date controlTime;

    /**
     * Default constructor
     *
     * @param i18nProvider {@link I18nProvider}
     * @param result {@link XmlVTS}
     * @param revocation {@link RevocationWrapper}
     * @param controlTime {@link Date}
     * @param constraint {@link LevelConstraint}
     */
    public RevocationIssuedBeforeControlTimeCheck(I18nProvider i18nProvider, XmlVTS result, RevocationWrapper revocation,
                                                  Date controlTime, LevelConstraint constraint) {
        super(i18nProvider, result, constraint);
        this.revocation = revocation;
        this.controlTime = controlTime;
    }

    @Override
    protected boolean process() {
        return revocation.getProductionDate() != null && revocation.getProductionDate().before(controlTime);
    }

    @Override
    protected String buildAdditionalInfo() {
        return i18nProvider.getMessage(MessageTag.REVOCATION_PRODUCTION_CONTROL_TIME, revocation.getId(),
                revocation.getProductionDate() != null ? ValidationProcessUtils.getFormattedDate(revocation.getProductionDate()) : null,
                ValidationProcessUtils.getFormattedDate(controlTime));
    }

    @Override
    protected MessageTag getMessageTag() {
        return MessageTag.PSV_HRDBIBCT;
    }

    @Override
    protected MessageTag getErrorMessageTag() {
        return MessageTag.PSV_HRDBIBCT_ANS;
    }

    @Override
    protected Indication getFailedIndicationForConclusion() {
        return null;
    }

    @Override
    protected SubIndication getFailedSubIndicationForConclusion() {
        return null;
    }

}
