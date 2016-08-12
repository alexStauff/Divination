package edu.dsu_academy_desu.divination;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class externalInfluencesActivity extends AppCompatActivity {
    public ArrayList<String> cards = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_external_influences);
        cards.add("The Fool");
        cards.add("The Fool");
        cards.add("The Fool Inverse");
        cards.add("The Magician");
        cards.add("The Magician Inverse");
        cards.add("The High Priestess");
        cards.add("The High Priestess Inverse");
        cards.add("The Empress");
        cards.add("The Empress Inverse");
        cards.add("The Emperor");
        cards.add("The Emperor Inverse");
        cards.add("The Hierophant");
        cards.add("The Hierophant Inverse");
        cards.add("The Lovers");
        cards.add("The Lovers Inverse");
        cards.add("The Chariot");
        cards.add("The Chariot Inverse");
        cards.add("Strength");
        cards.add("Strength Inverse");
        cards.add("The Hermit");
        cards.add("The Hermit Inverse");
        cards.add("Wheel of Fortune");
        cards.add("Wheel of Fortune Inverse");
        cards.add("Justice");
        cards.add("Justice Inverse");
        cards.add("The Hanged Man");
        cards.add("The Hanged Man Inverse");
        cards.add("Death");
        cards.add("Death Inverse");
        cards.add("Temperance");
        cards.add("Temperance Inverse");
        cards.add("The Devil");
        cards.add("The Devil Inverse");
        cards.add("The Tower");
        cards.add("The Tower Inverse");
        cards.add("The Star");
        cards.add("The Star Inverse");
        cards.add("The Moon");
        cards.add("The Moon Inverse");
        cards.add("The Sun");
        cards.add("The Sun Inverse");
        cards.add("Judgement");
        cards.add("Judgement Inverse");
        cards.add("The World");
        cards.add("The World Inverse");

        cards.add("Ace of Swords");
        cards.add("King of Swords");
        cards.add("Queen of Swords");
        cards.add("Knight of Swords");
        cards.add("Page of Swords");
        cards.add("Ten of Swords");
        cards.add("Nine of Swords");
        cards.add("Eight of Swords");
        cards.add("Seven of Swords");
        cards.add("Six of Swords");
        cards.add("Five of Swords");
        cards.add("Four of Swords");
        cards.add("Three of Swords");
        cards.add("Two of Swords");

        cards.add("Ace of Swords Inverse");
        cards.add("King of Swords Inverse");
        cards.add("Queen of Swords Inverse");
        cards.add("Page of Swords Inverse");
        cards.add("Ten of Swords Inverse");
        cards.add("Nine of Swords Inverse");
        cards.add("Eight of Swords Inverse");
        cards.add("Seven of Swords Inverse");
        cards.add("Six of Swords Inverse");
        cards.add("Five of Swords Inverse");
        cards.add("Four of Swords Inverse");
        cards.add("Three of Swords Inverse");
        cards.add("Two of Swords Inverse");

        cards.add("Ace of Wands");
        cards.add("King of Wands");
        cards.add("Queen of Wands");
        cards.add("Knight of Wands");
        cards.add("Page of Wands");
        cards.add("Ten of Wands");
        cards.add("Nine of Wands");
        cards.add("Eight of Wands");
        cards.add("Seven of Wands");
        cards.add("Six of Wands");
        cards.add("Five of Wands");
        cards.add("Four of Wands");
        cards.add("Three of Wands");
        cards.add("Two of Wands");

        cards.add("Ace of Wands Inverse");
        cards.add("King of Wands Inverse");
        cards.add("Queen of Wands Inverse");
        cards.add("Page of Wands Inverse");
        cards.add("Ten of Wands Inverse");
        cards.add("Nine of Wands Inverse");
        cards.add("Eight of Wands Inverse");
        cards.add("Seven of Wands Inverse");
        cards.add("Six of Wands Inverse");
        cards.add("Five of Wands Inverse");
        cards.add("Four of Wands Inverse");
        cards.add("Three of Wands Inverse");
        cards.add("Two of Wands Inverse");

        cards.add("Ace of Cups");
        cards.add("King of Cups");
        cards.add("Knight of Cups");
        cards.add("Queen of Cups");
        cards.add("Page of Cups");
        cards.add("Ten of Cups");
        cards.add("Nine of Cups");
        cards.add("Eight of Cups");
        cards.add("Seven of Cups");
        cards.add("Six of Cups");
        cards.add("Five of Cups");
        cards.add("Four of Cups");
        cards.add("Three of Cups");
        cards.add("Two of Cups");

        cards.add("Ace of Cups Inverse");
        cards.add("King of Cups Inverse");
        cards.add("Queen of Cups Inverse");
        cards.add("Page of Cups Inverse");
        cards.add("Ten of Cups Inverse");
        cards.add("Nine of Cups Inverse");
        cards.add("Eight of Cups Inverse");
        cards.add("Seven of Cups Inverse");
        cards.add("Six of Cups Inverse");
        cards.add("Five of Cups Inverse");
        cards.add("Four of Cups Inverse");
        cards.add("Three of Cups Inverse");
        cards.add("Two of Cups Inverse");

        cards.add("Ace of Pentacles");
        cards.add("King of Pentacles");
        cards.add("Queen of Pentacles");
        cards.add("Knight of Pentacles");
        cards.add("Page of Pentacles");
        cards.add("Ten of Pentacles");
        cards.add("Nine of Pentacles");
        cards.add("Eight of Pentacles");
        cards.add("Seven of Pentacles");
        cards.add("Six of Pentacles");
        cards.add("Five of Pentacles");
        cards.add("Four of Pentacles");
        cards.add("Three of Pentacles");
        cards.add("Two of Pentacles");

        cards.add("Ace of Pentacles Inverse");
        cards.add("King of Pentacles Inverse");
        cards.add("Queen of Pentacles Inverse");
        cards.add("Page of Pentacles Inverse");
        cards.add("Ten of Pentacles Inverse");
        cards.add("Nine of Pentacles Inverse");
        cards.add("Eight of Pentacles Inverse");
        cards.add("Seven of Pentacles Inverse");
        cards.add("Six of Pentacles Inverse");
        cards.add("Five of Pentacles Inverse");
        cards.add("Four of Pentacles Inverse");
        cards.add("Three of Pentacles Inverse");
        cards.add("Two of Pentacles Inverse");

        Collections.shuffle(cards);

        if (cards.get(0) == "The Fool") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Folly, mania, extravagance, intoxication, delirium, frenzy," +
                    " bewrayment.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.fool);
        } else if (cards.get(0) == "The Fool Inverse") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Negligence, absence, distribution, carelessness, apathy, nullity, " +
                    "vanity.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.foolupsidedown);
        } else if (cards.get(0) == "The Magician") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Skill, diplomacy, address, subtlety; sickness, pain, loss, disaster, " +
                    "snares of enemies; self-confidence, will; the Querent, if male.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.magician);
        } else if (cards.get(0) == "The Magician Inverse") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Physician, Magus, mental disease, disgrace, disquiet.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.magicianinverse);
        } else if (cards.get(0) == "The High Priestess") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Secrets, mystery, the future as yet unrevealed; the woman who " +
                    "interests the Querent, if male; the Querent herself, if female; silence, " +
                    "tenacity; mystery, wisdom, science.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.priestess);
        } else if (cards.get(0) == "The High Priestess Inverse") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Passion, moral or physical ardour, conceit, surface knowledge.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.priestessinverse);
        } else if (cards.get(0) == "The Empress") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Fruitfulness, action, initiative, length of days; the unknown, " +
                    "clandestine; also difficulty, doubt, ignorance..");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.empress);
        } else if (cards.get(0) == "The Empress Inverse") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Light, truth, the unravelling of involved matters, public rejoicings; " +
                    "according to another reading, vacillation.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.empressinverse);
        } else if (cards.get(0) == "The Emperor") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Stability, power, protection, realization; a great person; aid, " +
                    "reason, conviction; also authority and will.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.emperor);
        } else if (cards.get(0) == "The Emperor Inverse") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Benevolence, compassion, credit; also confusion to enemies, " +
                    "obstruction, immaturity.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.emperorinverse);
        } else if (cards.get(0) == "The Hierophant") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Marriage, alliance, captivity, servitude; by another account, mercy " +
                    "and goodness; inspiration; the man to whom the Querent has recourse.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.hierophant);
        } else if (cards.get(0) == "The Hierophant Inverse") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Society, good understanding, concord, overkindness, weakness.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.hierophantinverse);
        } else if (cards.get(0) == "The Lovers") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Attraction, love, beauty, trials overcome.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.lovers);
        } else if (cards.get(0) == "The Lovers Inverse") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Failure, foolish designs. Another account speaks of marriage " +
                    "frustrated and contrarieties of all kinds.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.loversinverse);
        } else if (cards.get(0) == "The Chariot") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Succour, providence also war, triumph, presumption, vengeance," +
                    " trouble.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.chariot);
        } else if (cards.get(0) == "The Chariot Inverse") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Riot, quarrel, dispute, litigation, defeat.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.chariotinverse);
        } else if (cards.get(0) == "Strength") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Power, energy, action, courage, magnanimity; also complete success" +
                    " and honours.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.strength);
        } else if (cards.get(0) == "Strength Inverse") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Despotism, abuse if power, weakness, discord, sometimes even disgrace.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.strengthinverse);
        } else if (cards.get(0) == "The Hermit") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Prudence, circumspection; also and especially treason, dissimulation," +
                    " roguery, corruption");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.hermit);
        } else if (cards.get(0) == "The Hermit Inverse") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Concealment, disguise, policy, fear, unreasoned caution.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.hermitinverse);
        } else if (cards.get(0) == "Wheel of Fortune") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Destiny, fortune, success, elevation, luck, felicity.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.wheel_of_fortune);
        } else if (cards.get(0) == "Wheel of Fortune Inverse") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Increase, abundance, superfluity.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.wheel_of_fortueninverse);
        } else if (cards.get(0) == "Justice") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Equity, rightness, probity, executive; triumph of the deserving " +
                    "side in law.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.justice);
        } else if (cards.get(0) == "Justice Inverse") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Law in all its departments, legal complications, bigotry, bias," +
                    " excessive severity.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.justiceinverse);
        } else if (cards.get(0) == "The Hanged Man") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Wisdom, circumspection, discernment, trials, sacrifice, intuition," +
                    " divination, prophecy.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.hanged_man);
        } else if (cards.get(0) == "The Hanged Man Inverse") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Selfishness, the crowd, body politic.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.hanged_maninverse);
        } else if (cards.get(0) == "Death") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("End, mortality, destruction, corruption also, for a man, the loss of" +
                    " a benefactor for a woman, many contrarieties; for a maid, failure of " +
                    "marriage projects.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.death);
        } else if (cards.get(0) == "Death Inverse") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Inertia, sleep, lethargy, petrifaction, somnambulism; hope destroyed.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.deathinverse);
        } else if (cards.get(0) == "Temperance") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Economy, moderation, frugality, management, accommodation.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.temperance);
        } else if (cards.get(0) == "Temperance Inverse") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Things connected with churches, religions, sects, the priesthood, " +
                    "sometimes even the priest who will marry the Querent; also disunion, " +
                    "unfortunate combinations, competing interests.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.temperanceinverse);
        } else if (cards.get(0) == "The Devil") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Ravage, violence, vehemence, extraordinary efforts, force, fatality;" +
                    " that which is predestined but is not for this reason evil.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.devil);
        } else if (cards.get(0) == "The Devil Inverse") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Evil fatality, weakness, pettiness, blindness.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.devilinverse);
        } else if (cards.get(0) == "The Tower") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Misery, distress, indigence, adversity, calamity, disgrace, deception," +
                    " ruin. It is a card in particular of unforeseen catastrophe.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.tower);
        } else if (cards.get(0) == "The Tower Inverse") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("oppression, imprisonment, tyranny and to a lesser degree, Misery, " +
                    "distress, indigence, adversity, calamity, disgrace, deception, ruin. It is " +
                    "a card in particular of unforeseen catastrophe.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.tower_reversed);
        } else if (cards.get(0) == "The Star") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Loss, theft, privation, abandonment; another reading says: hope and" +
                    " bright prospects.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.star);
        } else if (cards.get(0) == "The Star Inverse") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Arrogance, haughtiness, impotence.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.starinverse);
        } else if (cards.get(0) == "The Moon") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Hidden enemies, danger, calumny, darkness, terror, deception, occult" +
                    " forces, error.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.moon);
        } else if (cards.get(0) == "The Moon Inverse") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Instability, inconstancy, silence, lesser degrees of deception and " +
                    "error.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.mooninverse);
        } else if (cards.get(0) == "The Sun") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Material happiness, fortunate marriage, contentment.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.sun);
        } else if (cards.get(0) == "The Sun Inverse") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Lesser Material happiness, fortunate marriage, contentment.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.suninverse);
        } else if (cards.get(0) == "Judgement") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Change of position, renewal, outcome. Another account specifies total" +
                    " loss though lawsuit.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.judgement);
        } else if (cards.get(0) == "Judgement Inverse") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Weakness, pusillanimity, simplicity; also deliberation, decision," +
                    " sentence.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.judgementinverse);
        } else if (cards.get(0) == "The World") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Assured success, recompense, voyage, route, emigration, " +
                    "flight, change of place.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.world);
        } else if (cards.get(0) == "The World Inverse") {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Inertia, fixity, stagnation, permanence.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.worldinverse);
        } else if(cards.get(0) == "Ace of Wands"){
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Creation, invention, enterprise, the powers which result in these;" +
                    " principle, beginning, source; birth, family, origin, and in a sense the" +
                    " virility which is behind them; the starting point of enterprises; according" +
                    " to another account, money, fortune, inheritance.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.ace_wands);
        }
        else if (cards.get(0)=="Ace of Wands Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Surprise, wonder, enchantment, emotion, trouble, fear.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.ace_wandsinverse);
        }
        else if (cards.get(0)=="Two of Wands")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Between the alternative readings there is no marriage possible; on the" +
                    " one hand, riches, fortune, magnificence; on the other, physical suffering," +
                    " disease, chagrin, sadness, mortification. The design gives one suggestion;" +
                    " here is a lord overlooking his dominion and alternately contemplating a" +
                    " globe; it looks like the malady, the mortification, the sadness of Alexander" +
                    " amidst the grandeur of this world's wealth.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.two_wands);
        }
        else if (cards.get(0)=="Two of Wands Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Surprise, wonder, enchantment, emotion, trouble, fear.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.two_wandsinverse);
        }
        else if(cards.get(0) == "Three of Wands")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("He symbolizes established strength, enterprise, effort, trade," +
                    " commerce, discovery; those are his ships, bearing his merchandise, which are" +
                    " sailing over the sea. The card also signifies able co-operation in business," +
                    " as if the successful merchant prince were looking from his side towards yours" +
                    " with a view to help you.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.three_wands);
        }
        else if(cards.get(0) == "Three of Wands Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("The end of troubles, suspension or cessation of adversity, toil" +
                    " and disappointment.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.three_wandsinverse);
        }
        else if(cards.get(0) == "Four of Wands")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("They are for once almost on the surface--country life, haven of refuge," +
                    " a species of domestic harvest-home, repose, concord, harmony, prosperity," +
                    " peace, and the perfected work of these.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.four_wands);
        }
        else if(cards.get(0) == "Four of Wands Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("prosperity, increase, felicity, beauty, embellishment.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.four_wandsinverse);
        }
        else if(cards.get(0) == "Five of Wands")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Imitation, as, for example, sham fight, but also the strenuous" +
                    " competition and struggle of the search after riches and fortune. In this " +
                    "sense it connects with the battle of life. Hence some attributions say that it" +
                    " is a card of gold, gain, opulence.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.five_wands);
        }
        else if(cards.get(0) == "Five of Wands Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Litigation, disputes, trickery, contradiction.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.five_wandsinverse);
        }
        else if(cards.get(0) == "Six of Wands")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("The card has been so designed that it can cover several significations;" +
                    " on the surface, it is a victor triumphing, but it is also great news, such as" +
                    " might be carried in state by the King's courier; it is expectation crowned" +
                    " with its own desire, the crown of hope, and so forth.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.six_wands);
        }
        else if(cards.get(0) == "Six of Wands Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Apprehension, fear, as of a victorious enemy at the gate; treachery, " +
                    "disloyalty, as of gates being opened to the enemy; also indefinite delay.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.six_wandsinverse);
        }
        else if(cards.get(0) == "Seven of Wands")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("It is a card of valour, for, on the surface, six are attacking one," +
                    " who has, however, the vantage position. On the intellectual plane, it " +
                    "signifies discussion, wordy strife; in business--negotiations, war of trade," +
                    " barter, competition. It is further a card of success, for the combatant is " +
                    "on the top and his enemies may be unable to reach him.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.seven_wands);
        }
        else if(cards.get(0) == "Seven of Wands Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Perplexity, embarrassments, anxiety. It is also a caution against" +
                    " indecision.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.seven_wandsinverse);
        }
        else if(cards.get(0) == "Eight of Wands")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Activity in undertakings, the path of such activity, swiftness, as " +
                    "that of an express messenger; great haste, great hope, speed towards an end" +
                    " which promises assured felicity; generally, that which is on the move; also" +
                    " the arrows of love.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.eight_wands);
        }
        else if(cards.get(0) == "Eight of Wands Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Arrows of jealousy, internal dispute, stingings of conscience, " +
                    "quarrels; and domestic disputes for persons who are married.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.eight_wandsinverse);
        }
        else if(cards.get(0) == "Nine of Wands")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("The card signifies strength in opposition. If attacked, the person " +
                    "will meet an onslaught boldly; and his build shews, that he may prove a" +
                    " formidable antagonist. With this main significance there are all its possible" +
                    " adjuncts--delay, suspension, adjournment.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.nine_wands);
        }
        else if(cards.get(0) == "Nine of Wands Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Obstacles, adversity, calamity.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.nine_wandsinvere);
        }
        else if(cards.get(0) == "Ten of Wands")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("A card of many significances, and some of the readings cannot be" +
                    " harmonized. I set aside that which connects it with honour and good faith." +
                    " The chief meaning is oppression simply, but it is also fortune, gain, any" +
                    " kind of success, and then it is the oppression of these things. It is also" +
                    " a card of false-seeming, disguise, perfidy. The place which the figure is" +
                    " approaching may suffer from the rods that he carries. Success is stultified" +
                    " if the Nine of Swords follows, and if it is a question of a lawsuit, there" +
                    " will be certain loss.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.ten_wands);
        }
        else if(cards.get(0) == "Ten of Wands Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Contrarieties, difficulties, intrigues, and their analogies.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.ten_wandsinverse);
        }
        else if(cards.get(0) == "Page of Wands")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Dark young man, faithful, a lover, an envoy, a postman. Beside a man," +
                    " he will bear favourable testimony concerning him. A dangerous rival, if" +
                    " followed by the Page of Cups. Has the chief qualities of his suit. He may " +
                    "signify family intelligence.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.page_wands);
        }
        else if(cards.get(0) == "Page of Wands Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Anecdotes, announcements, evil news. Also indecision and the" +
                    " instability which accompanies it.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.page_wandsinverse);
        }
        else if(cards.get(0) == "Knight of Wands")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Departure, absence, flight, emigration. A dark young man, friendly." +
                    " Change of residence.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.knight_wands);
        }
        else if(cards.get(0) == "Knight of Wands Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Rupture, division, interruption, discord.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.knight_wandsinverse);
        }
        else if(cards.get(0) == "Queen of Wands")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("A dark woman, countrywoman, friendly, chaste, loving, honourable. If" +
                    " the card beside her signifies a man, she is well disposed towards him; if a" +
                    " woman, she is interested in the Querent. Also, love of money, or a certain" +
                    " success in business.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.queen_wands);
        }
        else if(cards.get(0) == "Queen of Wands Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Good, economical, obliging, serviceable. Signifies also--but in" +
                    " certain positions and in the neighbourhood of other cards tending in such " +
                    "directions--opposition, jealousy, even deceit and infidelity.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.queen_wandsinverse);
        }
        else if(cards.get(0) == "King of Wands")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Dark man, friendly, countryman, generally married, honest and" +
                    " conscientious. The card always signifies honesty, and may mean news" +
                    " concerning an unexpected heritage to fall in before very long.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.king_wands);
        }
        else if(cards.get(0) == "King of Wands Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Good, but severe; austere, yet tolerant.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.king_wandsinverse);
        }
        else if(cards.get(0) == "Ace of Cups")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("House of the true heart, joy, content, abode, nourishment, abundance," +
                    " fertility; Holy Table, felicity hereof.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.ace_cups);
        }
        else if(cards.get(0) == "Ace of Cups Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("House of the false heart, mutation, instability, revolution.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.ace_cupsinverse);
        }
        else if(cards.get(0) == "Two of Cups")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Love, passion, friendship, affinity, union, concord, sympathy, the" +
                    " interrelation of the sexes, and--as a suggestion apart from all offices of" +
                    " divination--that desire which is not in Nature, but by which Nature is" +
                    " sanctified.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.two_cups);
        }
        else if(cards.get(0) == "Two of Cups Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Favourable in things of pleasure and business, as well as love; also" +
                    " wealth and honour.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.two_cupsinverse);
        }
        else if(cards.get(0) == "Three of Cups")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("The conclusion of any matter in plenty, perfection and merriment;" +
                    " happy issue, victory, fulfilment, solace, healing.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.three_cups);
        }
        else if(cards.get(0) == "Three of Cups Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Expedition, dispatch, achievement, end. It signifies also the side" +
                    " of excess in physical enjoyment, and the pleasures of the senses.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.three_cupsinverse);
        }
        else if(cards.get(0) == "Four of Cups")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Weariness, disgust, aversion, imaginary vexations, as if the wine of" +
                    " this world had caused satiety only; another wine, as if a fairy gift, is now" +
                    " offered the wastrel, but he sees no consolation therein. This is also a card" +
                    " of blended pleasure.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.four_cups);
        }
        else if(cards.get(0) == "Four of Cups Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Novelty, presage, new instruction, new relations.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.four_cupsinverse);
        }
        else if(cards.get(0) == "Five of Cups")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("It is a card of loss, but something remains over; three have been" +
                    " taken, but two are left; it is a card of inheritance, patrimony," +
                    " transmission, but not corresponding to expectations; with some interpreters" +
                    " it is a card of marriage, but not without bitterness or frustration.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.five_cups);
        }
        else if(cards.get(0) == "Five of Cups Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("News, alliances, affinity, consanguinity, ancestry, return, false" +
                    " projects.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.five_cupsinverse);
        }
        else if(cards.get(0) == "Six of Cups")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("A card of the past and of memories, looking back, as--for example--on" +
                    " childhood; happiness, enjoyment, but coming rather from the past; things" +
                    " that have vanished. Another reading reverses this, giving new relations, new" +
                    " knowledge, new environment, and then the children are disporting in an " +
                    "unfamiliar precinct.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.six_cups);
        }
        else if(cards.get(0) == "Six of Cups Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("The future, renewal, that which will come to pass presently.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.six_cupsinverse);
        }
        else if(cards.get(0) == "Seven of Cups")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Fairy favours, images of reflection, sentiment, imagination, things" +
                    " seen in the glass of contemplation; some attainment in these degrees, but" +
                    " nothing permanent or substantial is suggested.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.seven_cups);
        }
        else if(cards.get(0) == "Seven of Cups Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Desire, will, determination, project.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.seven_cupsinverse);
        }
        else if(cards.get(0) == "Eight of Cups")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("The card speaks for itself on the surface, but other readings are" +
                    " entirely antithetical--giving joy, mildness, timidity, honour, modesty. In" +
                    " practice, it is usually found that the card shews the decline of a matter," +
                    " or that a matter which has been thought to be important is really of slight" +
                    " consequence--either for good or evil.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.eight_cups);
        }
        else if(cards.get(0) == "Eight of Cups Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Good, but severe; austere, yet tolerant.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.eight_cupsinverse);
        }
        else if(cards.get(0) == "Nine of Cups")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Concord, contentment, physical bien-être; also victory, success," +
                    " advantage; satisfaction for the Querent or person for whom the consultation" +
                    " is made.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.nine_cups);
        }
        else if(cards.get(0) == "Nine of Cups Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Truth, loyalty, liberty; but the readings vary and include mistakes," +
                    " imperfections, etc.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.nine_cupsinverse);
        }
        else if(cards.get(0) == "Ten of Cups")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Contentment, repose of the entire heart; the perfection of " +
                    " state; also perfection of human love and friendship; if with several" +
                    " picture-cards, a person who is taking charge of the Querent's interests;" +
                    " also the town, village or country inhabited by the Querent.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.ten_cups);
        }
        else if(cards.get(0) == "Ten of Cups Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Repose of the false heart, indignation, violence");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.ten_cupsinverse);
        }
        else if(cards.get(0) == "Page of Cups")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Fair young man, one impelled to render service and with whom the" +
                    " Querent will be connected; a studious youth; news, message; application," +
                    " reflection, meditation; also these things directed to business.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.page_cups);
        }
        else if(cards.get(0) == "Page of Cups Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Taste, inclination, attachment, seduction, deception, artifice.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.page_cupsinverse);
        }
        else if(cards.get(0) == "Knight of Cups")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Arrival, approach--sometimes that of a messenger; advances," +
                    " proposition, demeanour, invitation, incitement.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.knight_cups);
        }
        else if(cards.get(0) == "Knight of Cups Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Trickery, artifice, subtlety, swindling, duplicity, fraud.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.knight_cupsinverse);
        }
        else if(cards.get(0) == "Queen of Cups")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Good, fair woman; honest, devoted woman, who will do service to the" +
                    " Querent; loving intelligence, and hence the gift of vision; success," +
                    " happiness, pleasure; also wisdom, virtue; a perfect spouse and a good mother");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.queen_cups);
        }
        else if(cards.get(0) == "Queen of Cups Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("The accounts vary; good woman; otherwise, distinguished woman but one" +
                    " not to be trusted; perverse woman; vice, dishonour, depravity.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.queen_cupsinverse);
        }
        else if(cards.get(0) == "King of Cups")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Fair man, man of business, law, or divinity; responsible, disposed" +
                    " to oblige the Querent; also equity, art and science, including those who" +
                    " profess science, law and art; creative intelligence.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.king_cups);
        }
        else if(cards.get(0) == "King of Cups Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Dishonest, double-dealing man; roguery, exaction, injustice, vice, " +
                    "scandal, pillage, considerable loss.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.king_cupsinverse);
        }
        else if(cards.get(0) == "Ace of Swords")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Triumph, the excessive degree in everything, conquest, triumph of" +
                    " force. It is a card of great force, in love as well as in hatred. The crown" +
                    " may carry a much higher significance than comes usually within the sphere of" +
                    " fortune-telling.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.ace_swords);
        }
        else if(cards.get(0) == "Ace of Swords Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Triumph, but the results are disastrous; another account" +
                    " says--conception, childbirth, augmentation, multiplicity.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.ace_swordsinverse);
        }
        else if(cards.get(0) == "Two of Swords")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Conformity and the equipoise which it suggests, courage, friendship," +
                    " concord in a state of arms; another reading gives tenderness, affection," +
                    " intimacy. The suggestion of harmony and other favourable readings must be" +
                    " considered in a qualified manner, as Swords generally are not symbolical of" +
                    " beneficent forces in human affairs.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.two_swords);
        }
        else if(cards.get(0) == "Two of Swords Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Imposture, falsehood, duplicity, disloyalty.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.two_swordsinverse);
        }
        else if(cards.get(0) == "Three of Swords")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Removal, absence, delay, division, rupture, dispersion, and all that" +
                    " the design signifies naturally, being too simple and obvious to call for" +
                    " specific enumeration.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.three_swords);
        }
        else if(cards.get(0) == "Three of Swords Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Mental alienation, error, loss, distraction, disorder, confusion.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.three_swordsinverse);
        }
        else if(cards.get(0) == "Four of Swords")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Vigilance, retreat, solitude, hermit's repose, exile, tomb and coffin." +
                    " It is these last that have suggested the design.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.four_swords);
        }
        else if(cards.get(0) == "Four of Swords Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Wise administration, circumspection, economy, avarice, precaution," +
                    " testament.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.four_swordsinverse);
        }
        else if(cards.get(0) == "Five of Swords")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Degradation, destruction, revocation, infamy, dishonour, loss, with the" +
                    " variants and analogues of these.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.five_swords);
        }
        else if(cards.get(0) == "Five of Swords Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Degradation, destruction, revocation, infamy, dishonour, loss, with " +
                    "the variants and analogues of these. Also burial and obsequies");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.five_swordsinverse);
        }
        else if(cards.get(0) == "Six of Swords")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("journey by water, route, way, envoy, commissionary, expedient.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.six_swords);
        }
        else if(cards.get(0) == "Six of Swords Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Declaration, confession, publicity; one account says that it is a" +
                    " proposal of love.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.six_swordsinverse);
        }
        else if(cards.get(0) == "Seven of Swords")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Design, attempt, wish, hope, confidence; also quarrelling, a plan that" +
                    " may fail, annoyance. The design is uncertain in its import, because the" +
                    " significations are widely at variance with each other.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.seven_swords);
        }
        else if(cards.get(0) == "Seven of Cups Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Good advice, counsel, instruction, slander, babbling");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.seven_inverse);
        }
        else if(cards.get(0) == "Eight of Swords")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Bad news, violent chagrin, crisis, censure, power in trammels," +
                    " conflict, calumny; also sickness.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.eight_swords);
        }
        else if(cards.get(0) == "Eight of Swords Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Disquiet, difficulty, opposition, accident, treachery; what is " +
                    "unforeseen; fatality.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.eight_swordsinverse);
        }
        else if(cards.get(0) == "Nine of Swords")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Death, failure, miscarriage, delay, deception, disappointment, despair.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.nine_swords);
        }
        else if(cards.get(0) == "Nine of Swords Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Imprisonment, suspicion, doubt, reasonable fear, shame.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.nine_swordsinverse);
        }
        else if(cards.get(0) == "Ten of Swords")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Whatsoever is intimated by the design; also pain, affliction, tears," +
                    " sadness, desolation. It is not especially a card of violent death.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.ten_swords);
        }
        else if(cards.get(0) == "Ten of Swords Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Advantage, profit, success, favour, but none of these are permanent;" +
                    " also power and authority.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.ten_swordsinverse);
        }
        else if(cards.get(0) == "Page of Swords")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Authority, overseeing, secret service, vigilance, spying, examination," +
                    " and the qualities thereto belonging.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.page_swords);
        }
        else if(cards.get(0) == "Page of Swords Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("More evil side of; Authority, overseeing, secret service, vigilance," +
                    " spying, examination, and the qualities thereto belonging.; what is unforeseen," +
                    " unprepared state; sickness is also intimated.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.page_swordsinverse);
        }
        else if(cards.get(0) == "Knight of Swords")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Skill, bravery, capacity, defence, address, enmity, wrath, war," +
                    " destruction, opposition, resistance, ruin. There is therefore a sense in " +
                    "which the card signifies death, but it carries this meaning only in its" +
                    " proximity to other cards of fatality.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.knight_swords);
        }
        else if(cards.get(0) == "Knight of Swords Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Imprudence, incapacity, extravagance.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.knight_swordsinverse);
        }
        else if(cards.get(0) == "Queen of Swords")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Widowhood, female sadness and embarrassment, absence, sterility, " +
                    "mourning, privation, separation.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.queen_swords);
        }
        else if(cards.get(0) == "Queen of Swords Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Malice, bigotry, artifice, prudery, bale, deceit.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.queen_swordsinverse);
        }
        else if(cards.get(0) == "King of Swords")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Whatsoever arises out of the idea of judgment and all its" +
                    " connexions-power, command, authority, militant intelligence, law, offices of" +
                    " the crown, and so forth.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.king_swords);
        }
        else if(cards.get(0) == "King of Swords Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Cruelty, perversity, barbarity, perfidy, evil intention.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.king_swordsinverse);
        }
        else if(cards.get(0) == "Ace of Pentacles")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Perfect contentment, felicity, ecstasy; also speedy intelligence; gold.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.ace_penta);
        }
        else if(cards.get(0) == "Ace of Pentacles Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("The evil side of wealth, bad intelligence; also great riches. In any" +
                    " case it shews prosperity, comfortable material conditions, but whether these" +
                    " are of advantage to the possessor will depend on whether the card is " +
                    "reversed or not.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.ace_pentainverse);
        }
        else if(cards.get(0) == "Two of Pentacles")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("On the one hand it is represented as a card of gaiety, recreation and" +
                    " its connexions, which is the subject of the design; but it is read also as" +
                    " news and messages in writing, as obstacles, agitation, trouble, embroilment.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.two_penta);
        }
        else if(cards.get(0) == "Two of Pentacles Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Enforced gaiety, simulated enjoyment, literal sense, handwriting," +
                    " composition, letters of exchange");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.two_pentainverse);
        }
        else if(cards.get(0) == "Three of Pentacles")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Métier, trade, skilled labour; usually, however, regarded as a card of" +
                    " nobility, aristocracy, renown, glory.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.three_penta);
        }
        else if(cards.get(0) == "Three of Pentacles Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Mediocrity, in work and otherwise, puerility, pettiness, weakness.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.three_pentainverse);
        }
        else if(cards.get(0) == "Four of Pentacles")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("The surety of possessions, cleaving to that which one has, gift, " +
                    "legacy, inheritance.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.four_penta);
        }
        else if(cards.get(0) == "Four of Pentacles Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Suspense, delay, opposition.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.four_pentainverse);
        }
        else if(cards.get(0) == "Five of Pentacles")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("The card foretells material trouble above all, whether in the form" +
                    " illustrated--that is, destitution--or otherwise. For some cartomancists, it" +
                    " is a card of love and lovers-wife, husband, friend, mistress; also" +
                    " concordance, affinities. These alternatives cannot be harmonized.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.five_penta);
        }
        else if(cards.get(0) == "Five of Pentacles Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Disorder, chaos, ruin, discord, profligacy.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.five_pentainverse);
        }
        else if(cards.get(0) == "Six of Pentacles")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Presents, gifts, gratification another account says attention," +
                    " vigilance now is the accepted time, present prosperity, etc.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.six_penta);
        }
        else if(cards.get(0) == "Six of Pentacles Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Desire, cupidity, envy, jealousy, illusion.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.six_pentainverse);
        }
        else if(cards.get(0) == "Seven of Pentacles")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("These are exceedingly contradictory; in the main, it is a card of" +
                    " money, business, barter; but one reading gives altercation, quarrels--and" +
                    " another innocence, ingenuity, purgation.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.seven_penta);
        }
        else if(cards.get(0) == "Seven of Pentacles Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Cause for anxiety regarding money which it may be proposed to lend.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.seven_pentainverse);
        }
        else if(cards.get(0) == "Eight of Pentacles")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Work, employment, commission, craftsmanship, skill in craft and" +
                    " business, perhaps in the preparatory stage.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.eight_penta);
        }
        else if(cards.get(0) == "Eight of Pentacles Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Voided ambition, vanity, cupidity, exaction, usury. It may also" +
                    " signify the possession of skill, in the sense of the ingenious mind turned to" +
                    " cunning and intrigue.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.eight_pentainverse);
        }
        else if(cards.get(0) == "Nine of Pentacles")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Prudence, safety, success, accomplishment, certitude, discernment.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.nine_penta);
        }
        else if(cards.get(0) == "Nine of Pentacles Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Roguery, deception, voided project, bad faith");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.nine_pentainverse);
        }
        else if(cards.get(0) == "Ten of Pentacles")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Gain, riches; family matters, archives, extraction, the abode of" +
                    " a family.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.ten_penta);
        }
        else if(cards.get(0) == "Ten of Pentacles Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Chance, fatality, loss, robbery, games of hazard; sometimes gift," +
                    " dowry, pension.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.ten_pentainverse);
        }
        else if(cards.get(0) == "Page of Pentacles")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Application, study, scholarship, reflection another reading says news," +
                    " messages and the bringer thereof; also rule, management");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.page_penta);
        }
        else if(cards.get(0) == "Page of Pentacles Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Prodigality, dissipation, liberality, luxury; unfavourable news.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.page_pentainverse);
        }
        else if(cards.get(0) == "Knight of Pentacles")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Utility, serviceableness, interest, responsibility, rectitude-all on" +
                    " the normal and external plane.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.knight_penta);
        }
        else if(cards.get(0) == "Knight of Pentacles Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("inertia, idleness, repose of that kind, stagnation; also placidity," +
                    " discouragement, carelessness.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.knight_pentainverse);
        }
        else if(cards.get(0) == "Queen of Pentacles")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Opulence, generosity, magnificence, security, liberty");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.queen_penta);
        }
        else if(cards.get(0) == "Queen of Pentacles Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Evil, suspicion, suspense, fear, mistrust");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.queen_pentainverse);
        }
        else if(cards.get(0) == "King of Pentacles")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Valour, realizing intelligence, business and normal intellectual" +
                    " aptitude, sometimes mathematical gifts and attainments of this kind; success " +
                    "in these paths.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.king_penta);
        }
        else if(cards.get(0) == "King of Pentacles Inverse")
        {
            TextView present = (TextView) findViewById(R.id.text);
            present.setText("Vice, weakness, ugliness, perversity, corruption, peril.");
            ImageView presentImage = (ImageView) findViewById(R.id.image);
            presentImage.setImageResource(R.drawable.king_pentainverse);
        }
        else {
            Toast.makeText(externalInfluencesActivity.this, "error", Toast.LENGTH_SHORT).show();
        }
        Button hopeNfear = (Button)findViewById(R.id.next);
        hopeNfear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(externalInfluencesActivity.this,
                        hopesNFearsActivity.class);
                startActivity(intent);
            }
        });
    }
}

