package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class ZendikarRising extends ExpansionSet {

    private static final ZendikarRising instance = new ZendikarRising();

    public static ZendikarRising getInstance() {
        return instance;
    }

    private ZendikarRising() {
        super("Zendikar Rising", "ZNR", ExpansionSet.buildDate(2020, 9, 25), SetType.EXPANSION);
        this.blockName = "Zendikar Rising";
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        this.maxCardNumberInBooster = 280;

    }
}
