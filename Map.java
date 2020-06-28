
/**
 * Write a description of class map here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Map
{
    private char[][] currentMap;
    int i, j;
    
    public Map(int rows, int cols){
        currentMap = new char[rows][cols];
        for(i = 0; i < rows; i++){
            for(j = 0; j < cols; j++){
             currentMap[i][j] = '.';   
            }
        }
    }

    public Map(char[][] mapTemplate){
        currentMap = mapTemplate;
    }
    
    public void addWalls(){
        
    }
    
    public String toString(){

    }
    
}
