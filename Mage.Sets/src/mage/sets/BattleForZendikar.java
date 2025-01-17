package mage.sets;

import mage.cards.ExpansionSet;
import mage.cards.repository.CardCriteria;
import mage.cards.repository.CardInfo;
import mage.cards.repository.CardRepository;
import mage.constants.Rarity;
import mage.constants.SetType;

import java.util.List;

/**
 * @author fireshoes
 */
public final class BattleForZendikar extends ExpansionSet {

    private static final BattleForZendikar instance = new BattleForZendikar();

    public static BattleForZendikar getInstance() {
        return instance;
    }

    private BattleForZendikar() {
        super("Battle for Zendikar", "BFZ", ExpansionSet.buildDate(2015, 10, 2), SetType.EXPANSION);
        this.blockName = "Battle for Zendikar";
        this.hasBoosters = true;
        this.hasBasicLands = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        this.ratioBoosterSpecialCommon = 144;

        cards.add(new SetCardInfo("Adverse Conditions", 54, Rarity.UNCOMMON, mage.cards.a.AdverseConditions.class));
        cards.add(new SetCardInfo("Akoum Firebird", 138, Rarity.MYTHIC, mage.cards.a.AkoumFirebird.class));
        cards.add(new SetCardInfo("Akoum Hellkite", 139, Rarity.RARE, mage.cards.a.AkoumHellkite.class));
        cards.add(new SetCardInfo("Akoum Stonewaker", 140, Rarity.UNCOMMON, mage.cards.a.AkoumStonewaker.class));
        cards.add(new SetCardInfo("Aligned Hedron Network", 222, Rarity.RARE, mage.cards.a.AlignedHedronNetwork.class));
        cards.add(new SetCardInfo("Ally Encampment", 228, Rarity.RARE, mage.cards.a.AllyEncampment.class));
        cards.add(new SetCardInfo("Altar's Reap", 103, Rarity.COMMON, mage.cards.a.AltarsReap.class));
        cards.add(new SetCardInfo("Angel of Renewal", 18, Rarity.UNCOMMON, mage.cards.a.AngelOfRenewal.class));
        cards.add(new SetCardInfo("Angelic Captain", 208, Rarity.RARE, mage.cards.a.AngelicCaptain.class));
        cards.add(new SetCardInfo("Angelic Gift", 19, Rarity.COMMON, mage.cards.a.AngelicGift.class));
        cards.add(new SetCardInfo("Anticipate", 69, Rarity.COMMON, mage.cards.a.Anticipate.class));
        cards.add(new SetCardInfo("Bane of Bala Ged", 1, Rarity.UNCOMMON, mage.cards.b.BaneOfBalaGed.class));
        cards.add(new SetCardInfo("Barrage Tyrant", 127, Rarity.RARE, mage.cards.b.BarrageTyrant.class));
        cards.add(new SetCardInfo("Beastcaller Savant", 170, Rarity.RARE, mage.cards.b.BeastcallerSavant.class));
        cards.add(new SetCardInfo("Belligerent Whiptail", 141, Rarity.COMMON, mage.cards.b.BelligerentWhiptail.class));
        cards.add(new SetCardInfo("Benthic Infiltrator", 55, Rarity.COMMON, mage.cards.b.BenthicInfiltrator.class));
        cards.add(new SetCardInfo("Blight Herder", 2, Rarity.RARE, mage.cards.b.BlightHerder.class));
        cards.add(new SetCardInfo("Blighted Cataract", 229, Rarity.UNCOMMON, mage.cards.b.BlightedCataract.class));
        cards.add(new SetCardInfo("Blighted Fen", 230, Rarity.UNCOMMON, mage.cards.b.BlightedFen.class));
        cards.add(new SetCardInfo("Blighted Gorge", 231, Rarity.UNCOMMON, mage.cards.b.BlightedGorge.class));
        cards.add(new SetCardInfo("Blighted Steppe", 232, Rarity.UNCOMMON, mage.cards.b.BlightedSteppe.class));
        cards.add(new SetCardInfo("Blighted Woodland", 233, Rarity.UNCOMMON, mage.cards.b.BlightedWoodland.class));
        cards.add(new SetCardInfo("Blisterpod", 163, Rarity.COMMON, mage.cards.b.Blisterpod.class));
        cards.add(new SetCardInfo("Bloodbond Vampire", 104, Rarity.UNCOMMON, mage.cards.b.BloodbondVampire.class));
        cards.add(new SetCardInfo("Boiling Earth", 142, Rarity.COMMON, mage.cards.b.BoilingEarth.class));
        cards.add(new SetCardInfo("Bone Splinters", 105, Rarity.COMMON, mage.cards.b.BoneSplinters.class));
        cards.add(new SetCardInfo("Breaker of Armies", 3, Rarity.UNCOMMON, mage.cards.b.BreakerOfArmies.class));
        cards.add(new SetCardInfo("Brilliant Spectrum", 70, Rarity.COMMON, mage.cards.b.BrilliantSpectrum.class));
        cards.add(new SetCardInfo("Bring to Light", 209, Rarity.RARE, mage.cards.b.BringToLight.class));
        cards.add(new SetCardInfo("Brood Butcher", 199, Rarity.RARE, mage.cards.b.BroodButcher.class));
        cards.add(new SetCardInfo("Brood Monitor", 164, Rarity.UNCOMMON, mage.cards.b.BroodMonitor.class));
        cards.add(new SetCardInfo("Broodhunter Wurm", 171, Rarity.COMMON, mage.cards.b.BroodhunterWurm.class));
        cards.add(new SetCardInfo("Brutal Expulsion", 200, Rarity.RARE, mage.cards.b.BrutalExpulsion.class));
        cards.add(new SetCardInfo("Call the Scions", 165, Rarity.COMMON, mage.cards.c.CallTheScions.class));
        cards.add(new SetCardInfo("Canopy Vista", 234, Rarity.RARE, mage.cards.c.CanopyVista.class));
        cards.add(new SetCardInfo("Carrier Thrall", 106, Rarity.UNCOMMON, mage.cards.c.CarrierThrall.class));
        cards.add(new SetCardInfo("Catacomb Sifter", 201, Rarity.UNCOMMON, mage.cards.c.CatacombSifter.class));
        cards.add(new SetCardInfo("Chasm Guide", 143, Rarity.UNCOMMON, mage.cards.c.ChasmGuide.class));
        cards.add(new SetCardInfo("Cinder Glade", 235, Rarity.RARE, mage.cards.c.CinderGlade.class));
        cards.add(new SetCardInfo("Cliffside Lookout", 20, Rarity.COMMON, mage.cards.c.CliffsideLookout.class));
        cards.add(new SetCardInfo("Cloud Manta", 71, Rarity.COMMON, mage.cards.c.CloudManta.class));
        cards.add(new SetCardInfo("Clutch of Currents", 72, Rarity.COMMON, mage.cards.c.ClutchOfCurrents.class));
        cards.add(new SetCardInfo("Coastal Discovery", 73, Rarity.UNCOMMON, mage.cards.c.CoastalDiscovery.class));
        cards.add(new SetCardInfo("Complete Disregard", 90, Rarity.COMMON, mage.cards.c.CompleteDisregard.class));
        cards.add(new SetCardInfo("Conduit of Ruin", 4, Rarity.RARE, mage.cards.c.ConduitOfRuin.class));
        cards.add(new SetCardInfo("Coralhelm Guide", 74, Rarity.COMMON, mage.cards.c.CoralhelmGuide.class));
        cards.add(new SetCardInfo("Courier Griffin", 21, Rarity.COMMON, mage.cards.c.CourierGriffin.class));
        cards.add(new SetCardInfo("Crumble to Dust", 128, Rarity.UNCOMMON, mage.cards.c.CrumbleToDust.class));
        cards.add(new SetCardInfo("Cryptic Cruiser", 56, Rarity.UNCOMMON, mage.cards.c.CrypticCruiser.class));
        cards.add(new SetCardInfo("Culling Drone", 91, Rarity.COMMON, mage.cards.c.CullingDrone.class));
        cards.add(new SetCardInfo("Dampening Pulse", 75, Rarity.UNCOMMON, mage.cards.d.DampeningPulse.class));
        cards.add(new SetCardInfo("Deathless Behemoth", 5, Rarity.UNCOMMON, mage.cards.d.DeathlessBehemoth.class));
        cards.add(new SetCardInfo("Defiant Bloodlord", 107, Rarity.RARE, mage.cards.d.DefiantBloodlord.class));
        cards.add(new SetCardInfo("Demon's Grasp", 108, Rarity.COMMON, mage.cards.d.DemonsGrasp.class));
        cards.add(new SetCardInfo("Desolation Twin", 6, Rarity.RARE, mage.cards.d.DesolationTwin.class));
        cards.add(new SetCardInfo("Dispel", 76, Rarity.COMMON, mage.cards.d.Dispel.class));
        cards.add(new SetCardInfo("Dominator Drone", 92, Rarity.COMMON, mage.cards.d.DominatorDrone.class));
        cards.add(new SetCardInfo("Dragonmaster Outcast", 144, Rarity.MYTHIC, mage.cards.d.DragonmasterOutcast.class));
        cards.add(new SetCardInfo("Drana's Emissary", 210, Rarity.UNCOMMON, mage.cards.d.DranasEmissary.class));
        cards.add(new SetCardInfo("Drana, Liberator of Malakir", 109, Rarity.MYTHIC, mage.cards.d.DranaLiberatorOfMalakir.class));
        cards.add(new SetCardInfo("Drowner of Hope", 57, Rarity.RARE, mage.cards.d.DrownerOfHope.class));
        cards.add(new SetCardInfo("Dust Stalker", 202, Rarity.RARE, mage.cards.d.DustStalker.class));
        cards.add(new SetCardInfo("Dutiful Return", 110, Rarity.COMMON, mage.cards.d.DutifulReturn.class));
        cards.add(new SetCardInfo("Earthen Arms", 172, Rarity.COMMON, mage.cards.e.EarthenArms.class));
        cards.add(new SetCardInfo("Eldrazi Devastator", 7, Rarity.COMMON, mage.cards.e.EldraziDevastator.class));
        cards.add(new SetCardInfo("Eldrazi Skyspawner", 58, Rarity.COMMON, mage.cards.e.EldraziSkyspawner.class));
        cards.add(new SetCardInfo("Emeria Shepherd", 22, Rarity.RARE, mage.cards.e.EmeriaShepherd.class));
        cards.add(new SetCardInfo("Encircling Fissure", 23, Rarity.UNCOMMON, mage.cards.e.EncirclingFissure.class));
        cards.add(new SetCardInfo("Endless One", 8, Rarity.RARE, mage.cards.e.EndlessOne.class));
        cards.add(new SetCardInfo("Evolving Wilds", 236, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Exert Influence", 77, Rarity.RARE, mage.cards.e.ExertInfluence.class));
        cards.add(new SetCardInfo("Expedition Envoy", 24, Rarity.UNCOMMON, mage.cards.e.ExpeditionEnvoy.class));
        cards.add(new SetCardInfo("Eyeless Watcher", 166, Rarity.COMMON, mage.cards.e.EyelessWatcher.class));
        cards.add(new SetCardInfo("Fathom Feeder", 203, Rarity.RARE, mage.cards.f.FathomFeeder.class));
        cards.add(new SetCardInfo("Felidar Cub", 25, Rarity.COMMON, mage.cards.f.FelidarCub.class));
        cards.add(new SetCardInfo("Felidar Sovereign", 26, Rarity.RARE, mage.cards.f.FelidarSovereign.class));
        cards.add(new SetCardInfo("Fertile Thicket", 237, Rarity.COMMON, mage.cards.f.FertileThicket.class));
        cards.add(new SetCardInfo("Firemantle Mage", 145, Rarity.UNCOMMON, mage.cards.f.FiremantleMage.class));
        cards.add(new SetCardInfo("Forerunner of Slaughter", 204, Rarity.UNCOMMON, mage.cards.f.ForerunnerOfSlaughter.class));
        cards.add(new SetCardInfo("Forest", "270a", Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", "271a", Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", "272a", Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", "273a", Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", "274a", Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 270, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Forest", 271, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Forest", 272, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Forest", 273, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Forest", 274, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Fortified Rampart", 27, Rarity.COMMON, mage.cards.f.FortifiedRampart.class));
        cards.add(new SetCardInfo("From Beyond", 167, Rarity.RARE, mage.cards.f.FromBeyond.class));
        cards.add(new SetCardInfo("Geyserfield Stalker", 111, Rarity.COMMON, mage.cards.g.GeyserfieldStalker.class));
        cards.add(new SetCardInfo("Ghostly Sentinel", 28, Rarity.COMMON, mage.cards.g.GhostlySentinel.class));
        cards.add(new SetCardInfo("Giant Mantis", 173, Rarity.COMMON, mage.cards.g.GiantMantis.class));
        cards.add(new SetCardInfo("Gideon's Reproach", 30, Rarity.COMMON, mage.cards.g.GideonsReproach.class));
        cards.add(new SetCardInfo("Gideon, Ally of Zendikar", 29, Rarity.MYTHIC, mage.cards.g.GideonAllyOfZendikar.class));
        cards.add(new SetCardInfo("Goblin War Paint", 146, Rarity.COMMON, mage.cards.g.GoblinWarPaint.class));
        cards.add(new SetCardInfo("Grave Birthing", 93, Rarity.COMMON, mage.cards.g.GraveBirthing.class));
        cards.add(new SetCardInfo("Greenwarden of Murasa", 174, Rarity.MYTHIC, mage.cards.g.GreenwardenOfMurasa.class));
        cards.add(new SetCardInfo("Grip of Desolation", 94, Rarity.UNCOMMON, mage.cards.g.GripOfDesolation.class));
        cards.add(new SetCardInfo("Grove Rumbler", 211, Rarity.UNCOMMON, mage.cards.g.GroveRumbler.class));
        cards.add(new SetCardInfo("Grovetender Druids", 212, Rarity.UNCOMMON, mage.cards.g.GrovetenderDruids.class));
        cards.add(new SetCardInfo("Gruesome Slaughter", 9, Rarity.RARE, mage.cards.g.GruesomeSlaughter.class));
        cards.add(new SetCardInfo("Guardian of Tazeem", 78, Rarity.RARE, mage.cards.g.GuardianOfTazeem.class));
        cards.add(new SetCardInfo("Guul Draz Overseer", 112, Rarity.RARE, mage.cards.g.GuulDrazOverseer.class));
        cards.add(new SetCardInfo("Hagra Sharpshooter", 113, Rarity.UNCOMMON, mage.cards.h.HagraSharpshooter.class));
        cards.add(new SetCardInfo("Halimar Tidecaller", 79, Rarity.UNCOMMON, mage.cards.h.HalimarTidecaller.class));
        cards.add(new SetCardInfo("Hedron Archive", 223, Rarity.UNCOMMON, mage.cards.h.HedronArchive.class));
        cards.add(new SetCardInfo("Hedron Blade", 224, Rarity.COMMON, mage.cards.h.HedronBlade.class));
        cards.add(new SetCardInfo("Herald of Kozilek", 205, Rarity.UNCOMMON, mage.cards.h.HeraldOfKozilek.class));
        cards.add(new SetCardInfo("Hero of Goma Fada", 31, Rarity.RARE, mage.cards.h.HeroOfGomaFada.class));
        cards.add(new SetCardInfo("Horribly Awry", 59, Rarity.UNCOMMON, mage.cards.h.HorriblyAwry.class));
        cards.add(new SetCardInfo("Incubator Drone", 60, Rarity.COMMON, mage.cards.i.IncubatorDrone.class));
        cards.add(new SetCardInfo("Infuse with the Elements", 175, Rarity.UNCOMMON, mage.cards.i.InfuseWithTheElements.class));
        cards.add(new SetCardInfo("Inspired Charge", 32, Rarity.COMMON, mage.cards.i.InspiredCharge.class));
        cards.add(new SetCardInfo("Island", "255a", Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", "256a", Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", "257a", Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", "258a", Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", "259a", Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 255, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Island", 256, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Island", 257, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Island", 258, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Island", 259, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Jaddi Offshoot", 176, Rarity.UNCOMMON, mage.cards.j.JaddiOffshoot.class));
        cards.add(new SetCardInfo("Kalastria Healer", 114, Rarity.COMMON, mage.cards.k.KalastriaHealer.class));
        cards.add(new SetCardInfo("Kalastria Nightwatch", 115, Rarity.COMMON, mage.cards.k.KalastriaNightwatch.class));
        cards.add(new SetCardInfo("Kiora, Master of the Depths", 213, Rarity.MYTHIC, mage.cards.k.KioraMasterOfTheDepths.class));
        cards.add(new SetCardInfo("Kitesail Scout", 33, Rarity.COMMON, mage.cards.k.KitesailScout.class));
        cards.add(new SetCardInfo("Kor Bladewhirl", 34, Rarity.UNCOMMON, mage.cards.k.KorBladewhirl.class));
        cards.add(new SetCardInfo("Kor Castigator", 35, Rarity.COMMON, mage.cards.k.KorCastigator.class));
        cards.add(new SetCardInfo("Kor Entanglers", 36, Rarity.UNCOMMON, mage.cards.k.KorEntanglers.class));
        cards.add(new SetCardInfo("Kozilek's Channeler", 10, Rarity.COMMON, mage.cards.k.KozileksChanneler.class));
        cards.add(new SetCardInfo("Kozilek's Sentinel", 129, Rarity.COMMON, mage.cards.k.KozileksSentinel.class));
        cards.add(new SetCardInfo("Lantern Scout", 37, Rarity.RARE, mage.cards.l.LanternScout.class));
        cards.add(new SetCardInfo("Lavastep Raider", 147, Rarity.COMMON, mage.cards.l.LavastepRaider.class));
        cards.add(new SetCardInfo("Lifespring Druid", 177, Rarity.COMMON, mage.cards.l.LifespringDruid.class));
        cards.add(new SetCardInfo("Lithomancer's Focus", 38, Rarity.COMMON, mage.cards.l.LithomancersFocus.class));
        cards.add(new SetCardInfo("Looming Spires", 238, Rarity.COMMON, mage.cards.l.LoomingSpires.class));
        cards.add(new SetCardInfo("Lumbering Falls", 239, Rarity.RARE, mage.cards.l.LumberingFalls.class));
        cards.add(new SetCardInfo("Makindi Patrol", 39, Rarity.COMMON, mage.cards.m.MakindiPatrol.class));
        cards.add(new SetCardInfo("Makindi Sliderunner", 148, Rarity.COMMON, mage.cards.m.MakindiSliderunner.class));
        cards.add(new SetCardInfo("Malakir Familiar", 116, Rarity.UNCOMMON, mage.cards.m.MalakirFamiliar.class));
        cards.add(new SetCardInfo("March from the Tomb", 214, Rarity.RARE, mage.cards.m.MarchFromTheTomb.class));
        cards.add(new SetCardInfo("Mind Raker", 95, Rarity.COMMON, mage.cards.m.MindRaker.class));
        cards.add(new SetCardInfo("Mire's Malice", 117, Rarity.COMMON, mage.cards.m.MiresMalice.class));
        cards.add(new SetCardInfo("Mist Intruder", 61, Rarity.COMMON, mage.cards.m.MistIntruder.class));
        cards.add(new SetCardInfo("Molten Nursery", 130, Rarity.UNCOMMON, mage.cards.m.MoltenNursery.class));
        cards.add(new SetCardInfo("Mortuary Mire", 240, Rarity.COMMON, mage.cards.m.MortuaryMire.class));
        cards.add(new SetCardInfo("Mountain", "265a", Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", "266a", Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", "267a", Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", "268a", Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", "269a", Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 265, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 266, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 267, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 268, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 269, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Munda, Ambush Leader", 215, Rarity.RARE, mage.cards.m.MundaAmbushLeader.class));
        cards.add(new SetCardInfo("Murasa Ranger", 178, Rarity.UNCOMMON, mage.cards.m.MurasaRanger.class));
        cards.add(new SetCardInfo("Murk Strider", 62, Rarity.COMMON, mage.cards.m.MurkStrider.class));
        cards.add(new SetCardInfo("Natural Connection", 179, Rarity.COMMON, mage.cards.n.NaturalConnection.class));
        cards.add(new SetCardInfo("Nettle Drone", 131, Rarity.COMMON, mage.cards.n.NettleDrone.class));
        cards.add(new SetCardInfo("Nirkana Assassin", 118, Rarity.COMMON, mage.cards.n.NirkanaAssassin.class));
        cards.add(new SetCardInfo("Nissa's Renewal", 180, Rarity.RARE, mage.cards.n.NissasRenewal.class));
        cards.add(new SetCardInfo("Noyan Dar, Roil Shaper", 216, Rarity.RARE, mage.cards.n.NoyanDarRoilShaper.class));
        cards.add(new SetCardInfo("Ob Nixilis Reignited", 119, Rarity.MYTHIC, mage.cards.o.ObNixilisReignited.class));
        cards.add(new SetCardInfo("Oblivion Sower", 11, Rarity.MYTHIC, mage.cards.o.OblivionSower.class));
        cards.add(new SetCardInfo("Omnath, Locus of Rage", 217, Rarity.MYTHIC, mage.cards.o.OmnathLocusOfRage.class));
        cards.add(new SetCardInfo("Ondu Champion", 149, Rarity.COMMON, mage.cards.o.OnduChampion.class));
        cards.add(new SetCardInfo("Ondu Greathorn", 40, Rarity.COMMON, mage.cards.o.OnduGreathorn.class));
        cards.add(new SetCardInfo("Ondu Rising", 41, Rarity.UNCOMMON, mage.cards.o.OnduRising.class));
        cards.add(new SetCardInfo("Oracle of Dust", 63, Rarity.COMMON, mage.cards.o.OracleOfDust.class));
        cards.add(new SetCardInfo("Oran-Rief Hydra", 181, Rarity.RARE, mage.cards.o.OranRiefHydra.class));
        cards.add(new SetCardInfo("Oran-Rief Invoker", 182, Rarity.COMMON, mage.cards.o.OranRiefInvoker.class));
        cards.add(new SetCardInfo("Outnumber", 150, Rarity.COMMON, mage.cards.o.Outnumber.class));
        cards.add(new SetCardInfo("Painful Truths", 120, Rarity.RARE, mage.cards.p.PainfulTruths.class));
        cards.add(new SetCardInfo("Part the Waterveil", 80, Rarity.MYTHIC, mage.cards.p.PartTheWaterveil.class));
        cards.add(new SetCardInfo("Pathway Arrows", 225, Rarity.UNCOMMON, mage.cards.p.PathwayArrows.class));
        cards.add(new SetCardInfo("Pilgrim's Eye", 226, Rarity.UNCOMMON, mage.cards.p.PilgrimsEye.class));
        cards.add(new SetCardInfo("Plains", "250a", Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", "251a", Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", "252a", Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", "253a", Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", "254a", Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 250, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Plains", 251, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Plains", 252, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Plains", 253, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Plains", 254, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Planar Outburst", 42, Rarity.RARE, mage.cards.p.PlanarOutburst.class));
        cards.add(new SetCardInfo("Plated Crusher", 183, Rarity.UNCOMMON, mage.cards.p.PlatedCrusher.class));
        cards.add(new SetCardInfo("Plummet", 184, Rarity.COMMON, mage.cards.p.Plummet.class));
        cards.add(new SetCardInfo("Prairie Stream", 241, Rarity.RARE, mage.cards.p.PrairieStream.class));
        cards.add(new SetCardInfo("Prism Array", 81, Rarity.RARE, mage.cards.p.PrismArray.class));
        cards.add(new SetCardInfo("Processor Assault", 132, Rarity.UNCOMMON, mage.cards.p.ProcessorAssault.class));
        cards.add(new SetCardInfo("Quarantine Field", 43, Rarity.MYTHIC, mage.cards.q.QuarantineField.class));
        cards.add(new SetCardInfo("Radiant Flames", 151, Rarity.RARE, mage.cards.r.RadiantFlames.class));
        cards.add(new SetCardInfo("Reckless Cohort", 152, Rarity.COMMON, mage.cards.r.RecklessCohort.class));
        cards.add(new SetCardInfo("Reclaiming Vines", 185, Rarity.COMMON, mage.cards.r.ReclaimingVines.class));
        cards.add(new SetCardInfo("Resolute Blademaster", 218, Rarity.UNCOMMON, mage.cards.r.ResoluteBlademaster.class));
        cards.add(new SetCardInfo("Retreat to Coralhelm", 82, Rarity.UNCOMMON, mage.cards.r.RetreatToCoralhelm.class));
        cards.add(new SetCardInfo("Retreat to Emeria", 44, Rarity.UNCOMMON, mage.cards.r.RetreatToEmeria.class));
        cards.add(new SetCardInfo("Retreat to Hagra", 121, Rarity.UNCOMMON, mage.cards.r.RetreatToHagra.class));
        cards.add(new SetCardInfo("Retreat to Kazandu", 186, Rarity.UNCOMMON, mage.cards.r.RetreatToKazandu.class));
        cards.add(new SetCardInfo("Retreat to Valakut", 153, Rarity.UNCOMMON, mage.cards.r.RetreatToValakut.class));
        cards.add(new SetCardInfo("Rising Miasma", 122, Rarity.UNCOMMON, mage.cards.r.RisingMiasma.class));
        cards.add(new SetCardInfo("Roil Spout", 219, Rarity.UNCOMMON, mage.cards.r.RoilSpout.class));
        cards.add(new SetCardInfo("Roil's Retribution", 45, Rarity.UNCOMMON, mage.cards.r.RoilsRetribution.class));
        cards.add(new SetCardInfo("Roilmage's Trick", 83, Rarity.COMMON, mage.cards.r.RoilmagesTrick.class));
        cards.add(new SetCardInfo("Rolling Thunder", 154, Rarity.UNCOMMON, mage.cards.r.RollingThunder.class));
        cards.add(new SetCardInfo("Rot Shambler", 187, Rarity.UNCOMMON, mage.cards.r.RotShambler.class));
        cards.add(new SetCardInfo("Ruin Processor", 12, Rarity.COMMON, mage.cards.r.RuinProcessor.class));
        cards.add(new SetCardInfo("Ruination Guide", 64, Rarity.UNCOMMON, mage.cards.r.RuinationGuide.class));
        cards.add(new SetCardInfo("Ruinous Path", 123, Rarity.RARE, mage.cards.r.RuinousPath.class));
        cards.add(new SetCardInfo("Rush of Ice", 84, Rarity.COMMON, mage.cards.r.RushOfIce.class));
        cards.add(new SetCardInfo("Salvage Drone", 65, Rarity.COMMON, mage.cards.s.SalvageDrone.class));
        cards.add(new SetCardInfo("Sanctum of Ugin", 242, Rarity.RARE, mage.cards.s.SanctumOfUgin.class));
        cards.add(new SetCardInfo("Sandstone Bridge", 243, Rarity.COMMON, mage.cards.s.SandstoneBridge.class));
        cards.add(new SetCardInfo("Scatter to the Winds", 85, Rarity.RARE, mage.cards.s.ScatterToTheWinds.class));
        cards.add(new SetCardInfo("Scour from Existence", 13, Rarity.COMMON, mage.cards.s.ScourFromExistence.class));
        cards.add(new SetCardInfo("Scythe Leopard", 188, Rarity.UNCOMMON, mage.cards.s.ScytheLeopard.class));
        cards.add(new SetCardInfo("Seek the Wilds", 189, Rarity.COMMON, mage.cards.s.SeekTheWilds.class));
        cards.add(new SetCardInfo("Serene Steward", 46, Rarity.UNCOMMON, mage.cards.s.SereneSteward.class));
        cards.add(new SetCardInfo("Serpentine Spike", 133, Rarity.RARE, mage.cards.s.SerpentineSpike.class));
        cards.add(new SetCardInfo("Shadow Glider", 47, Rarity.COMMON, mage.cards.s.ShadowGlider.class));
        cards.add(new SetCardInfo("Shambling Vent", 244, Rarity.RARE, mage.cards.s.ShamblingVent.class));
        cards.add(new SetCardInfo("Shatterskull Recruit", 155, Rarity.COMMON, mage.cards.s.ShatterskullRecruit.class));
        cards.add(new SetCardInfo("Sheer Drop", 48, Rarity.COMMON, mage.cards.s.SheerDrop.class));
        cards.add(new SetCardInfo("Shrine of the Forsaken Gods", 245, Rarity.RARE, mage.cards.s.ShrineOfTheForsakenGods.class));
        cards.add(new SetCardInfo("Silent Skimmer", 96, Rarity.COMMON, mage.cards.s.SilentSkimmer.class));
        cards.add(new SetCardInfo("Sire of Stagnation", 206, Rarity.MYTHIC, mage.cards.s.SireOfStagnation.class));
        cards.add(new SetCardInfo("Skitterskin", 97, Rarity.UNCOMMON, mage.cards.s.Skitterskin.class));
        cards.add(new SetCardInfo("Skyline Cascade", 246, Rarity.COMMON, mage.cards.s.SkylineCascade.class));
        cards.add(new SetCardInfo("Skyrider Elf", 220, Rarity.UNCOMMON, mage.cards.s.SkyriderElf.class));
        cards.add(new SetCardInfo("Slab Hammer", 227, Rarity.UNCOMMON, mage.cards.s.SlabHammer.class));
        cards.add(new SetCardInfo("Sludge Crawler", 98, Rarity.COMMON, mage.cards.s.SludgeCrawler.class));
        cards.add(new SetCardInfo("Smite the Monstrous", 49, Rarity.COMMON, mage.cards.s.SmiteTheMonstrous.class));
        cards.add(new SetCardInfo("Smoldering Marsh", 247, Rarity.RARE, mage.cards.s.SmolderingMarsh.class));
        cards.add(new SetCardInfo("Smothering Abomination", 99, Rarity.RARE, mage.cards.s.SmotheringAbomination.class));
        cards.add(new SetCardInfo("Snapping Gnarlid", 190, Rarity.COMMON, mage.cards.s.SnappingGnarlid.class));
        cards.add(new SetCardInfo("Spawning Bed", 248, Rarity.UNCOMMON, mage.cards.s.SpawningBed.class));
        cards.add(new SetCardInfo("Spell Shrivel", 66, Rarity.COMMON, mage.cards.s.SpellShrivel.class));
        cards.add(new SetCardInfo("Stasis Snare", 50, Rarity.UNCOMMON, mage.cards.s.StasisSnare.class));
        cards.add(new SetCardInfo("Stone Haven Medic", 51, Rarity.COMMON, mage.cards.s.StoneHavenMedic.class));
        cards.add(new SetCardInfo("Stonefury", 156, Rarity.COMMON, mage.cards.s.Stonefury.class));
        cards.add(new SetCardInfo("Sunken Hollow", 249, Rarity.RARE, mage.cards.s.SunkenHollow.class));
        cards.add(new SetCardInfo("Sure Strike", 157, Rarity.COMMON, mage.cards.s.SureStrike.class));
        cards.add(new SetCardInfo("Swamp", "260a", Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", "261a", Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", "262a", Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", "263a", Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", "264a", Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 260, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 261, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 262, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 263, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 264, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_BFZ_VARIOUS));
        cards.add(new SetCardInfo("Swarm Surge", 100, Rarity.COMMON, mage.cards.s.SwarmSurge.class));
        cards.add(new SetCardInfo("Swell of Growth", 191, Rarity.COMMON, mage.cards.s.SwellOfGrowth.class));
        cards.add(new SetCardInfo("Sylvan Scrying", 192, Rarity.UNCOMMON, mage.cards.s.SylvanScrying.class));
        cards.add(new SetCardInfo("Tajuru Beastmaster", 193, Rarity.COMMON, mage.cards.t.TajuruBeastmaster.class));
        cards.add(new SetCardInfo("Tajuru Stalwart", 194, Rarity.COMMON, mage.cards.t.TajuruStalwart.class));
        cards.add(new SetCardInfo("Tajuru Warcaller", 195, Rarity.UNCOMMON, mage.cards.t.TajuruWarcaller.class));
        cards.add(new SetCardInfo("Tandem Tactics", 52, Rarity.COMMON, mage.cards.t.TandemTactics.class));
        cards.add(new SetCardInfo("Territorial Baloth", 196, Rarity.COMMON, mage.cards.t.TerritorialBaloth.class));
        cards.add(new SetCardInfo("Tide Drifter", 67, Rarity.UNCOMMON, mage.cards.t.TideDrifter.class));
        cards.add(new SetCardInfo("Tightening Coils", 86, Rarity.COMMON, mage.cards.t.TighteningCoils.class));
        cards.add(new SetCardInfo("Titan's Presence", 14, Rarity.UNCOMMON, mage.cards.t.TitansPresence.class));
        cards.add(new SetCardInfo("Touch of the Void", 134, Rarity.COMMON, mage.cards.t.TouchOfTheVoid.class));
        cards.add(new SetCardInfo("Transgress the Mind", 101, Rarity.UNCOMMON, mage.cards.t.TransgressTheMind.class));
        cards.add(new SetCardInfo("Tunneling Geopede", 158, Rarity.UNCOMMON, mage.cards.t.TunnelingGeopede.class));
        cards.add(new SetCardInfo("Turn Against", 135, Rarity.UNCOMMON, mage.cards.t.TurnAgainst.class));
        cards.add(new SetCardInfo("Ugin's Insight", 87, Rarity.RARE, mage.cards.u.UginsInsight.class));
        cards.add(new SetCardInfo("Ulamog's Despoiler", 16, Rarity.UNCOMMON, mage.cards.u.UlamogsDespoiler.class));
        cards.add(new SetCardInfo("Ulamog's Nullifier", 207, Rarity.UNCOMMON, mage.cards.u.UlamogsNullifier.class));
        cards.add(new SetCardInfo("Ulamog's Reclaimer", 68, Rarity.UNCOMMON, mage.cards.u.UlamogsReclaimer.class));
        cards.add(new SetCardInfo("Ulamog, the Ceaseless Hunger", 15, Rarity.MYTHIC, mage.cards.u.UlamogTheCeaselessHunger.class));
        cards.add(new SetCardInfo("Undergrowth Champion", 197, Rarity.MYTHIC, mage.cards.u.UndergrowthChampion.class));
        cards.add(new SetCardInfo("Unified Front", 53, Rarity.UNCOMMON, mage.cards.u.UnifiedFront.class));
        cards.add(new SetCardInfo("Unnatural Aggression", 168, Rarity.COMMON, mage.cards.u.UnnaturalAggression.class));
        cards.add(new SetCardInfo("Valakut Invoker", 159, Rarity.COMMON, mage.cards.v.ValakutInvoker.class));
        cards.add(new SetCardInfo("Valakut Predator", 160, Rarity.COMMON, mage.cards.v.ValakutPredator.class));
        cards.add(new SetCardInfo("Vampiric Rites", 124, Rarity.UNCOMMON, mage.cards.v.VampiricRites.class));
        cards.add(new SetCardInfo("Vestige of Emrakul", 136, Rarity.COMMON, mage.cards.v.VestigeOfEmrakul.class));
        cards.add(new SetCardInfo("Veteran Warleader", 221, Rarity.RARE, mage.cards.v.VeteranWarleader.class));
        cards.add(new SetCardInfo("Vile Aggregate", 137, Rarity.UNCOMMON, mage.cards.v.VileAggregate.class));
        cards.add(new SetCardInfo("Void Attendant", 169, Rarity.UNCOMMON, mage.cards.v.VoidAttendant.class));
        cards.add(new SetCardInfo("Void Winnower", 17, Rarity.MYTHIC, mage.cards.v.VoidWinnower.class));
        cards.add(new SetCardInfo("Volcanic Upheaval", 161, Rarity.COMMON, mage.cards.v.VolcanicUpheaval.class));
        cards.add(new SetCardInfo("Voracious Null", 125, Rarity.COMMON, mage.cards.v.VoraciousNull.class));
        cards.add(new SetCardInfo("Wasteland Strangler", 102, Rarity.RARE, mage.cards.w.WastelandStrangler.class));
        cards.add(new SetCardInfo("Wave-Wing Elemental", 88, Rarity.COMMON, mage.cards.w.WaveWingElemental.class));
        cards.add(new SetCardInfo("Windrider Patrol", 89, Rarity.UNCOMMON, mage.cards.w.WindriderPatrol.class));
        cards.add(new SetCardInfo("Woodland Wanderer", 198, Rarity.RARE, mage.cards.w.WoodlandWanderer.class));
        cards.add(new SetCardInfo("Zada, Hedron Grinder", 162, Rarity.RARE, mage.cards.z.ZadaHedronGrinder.class));
        cards.add(new SetCardInfo("Zulaport Cutthroat", 126, Rarity.UNCOMMON, mage.cards.z.ZulaportCutthroat.class));
    }

    @Override
    protected List<CardInfo> findCardsByRarity(Rarity rarity) {
        List<CardInfo> cardInfos = super.findCardsByRarity(rarity);
        if (rarity == Rarity.LAND) {
            // only the full-art basic lands are found in boosters
            cardInfos.removeIf(cardInfo -> cardInfo.getCardNumber().contains("a"));
        } else if (rarity == Rarity.SPECIAL) {
            cardInfos.addAll(CardRepository.instance.findCards(new CardCriteria().setCodes("EXP")));
            cardInfos.removeIf(cardInfo -> cardInfo.getCardNumberAsInt() > 25);
        }
        return cardInfos;
    }
}
