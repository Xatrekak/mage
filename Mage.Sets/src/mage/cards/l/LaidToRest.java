package mage.cards.l;

import mage.abilities.common.DiesCreatureTriggeredAbility;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.common.GainLifeEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.counters.CounterType;
import mage.filter.FilterPermanent;
import mage.filter.common.FilterControlledCreaturePermanent;
import mage.filter.common.FilterControlledPermanent;

import java.util.UUID;

/**
 * @author TheElk801
 */
public final class LaidToRest extends CardImpl {

    private static final FilterPermanent filter
            = new FilterControlledPermanent(SubType.HUMAN, "a Human you control");
    private static final FilterPermanent filter2
            = new FilterControlledCreaturePermanent("a creature you control with a +1/+1 counter on it");

    static {
        filter.add(CounterType.P1P1.getPredicate());
    }

    public LaidToRest(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{3}{G}");

        // Whenever a Human you control dies, draw a card.
        this.addAbility(new DiesCreatureTriggeredAbility(
                new DrawCardSourceControllerEffect(1), false, filter
        ));

        // Whenever a creature you control with a +1/+1 counter on it dies, you gain 2 life.
        this.addAbility(new DiesCreatureTriggeredAbility(new GainLifeEffect(2), false, filter2));
    }

    private LaidToRest(final LaidToRest card) {
        super(card);
    }

    @Override
    public LaidToRest copy() {
        return new LaidToRest(this);
    }
}
