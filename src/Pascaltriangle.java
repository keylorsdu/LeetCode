import java.util.ArrayList;
import java.util.List;


public class Pascaltriangle {
public List<List<Integer>> generate(int numRows) {

	
	List<List<Integer>>  triangles = new ArrayList<List<Integer>>();
	int i = 0;
	for(i = 0 ; i<numRows;i++){
		List<Integer> tri = new ArrayList<Integer>();
		if(i == 0){

			tri.add(1);
		}else{

			for (int j = 0 ;j<i+1;j++){
				if(j == 0)tri.add(1);
				else if(j == i) tri.add(1);
				else tri.add(triangles.get(i-1).get(j-1)+triangles.get(i-1).get(j));
			}
		}
		triangles.add(tri);
		
	}

	return triangles;
        
        
    }

}
