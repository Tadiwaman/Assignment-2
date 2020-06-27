
/**
 * Write a description of class Encounter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Encounter
{
    String statToCheck; // which stat is being used. (eg. "mental" or "physical")
    int difficulty; // difficulty of the stat check (compared to hero skill)
    Item reward; // what the hero gets if they win the Encounter
    int risk; // how much stress the hero gains if they lose.
    // Output messages for the Encounter
    String name = "Space Basketball";
    String description = "A team of aliens challenge you to a game of basketball";
    String winningDescription = " You win. Take that aliens!"; // win message
    String losingDescription = "You lose! Too bad for you"; // lose message�
}
