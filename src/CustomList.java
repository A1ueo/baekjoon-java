
import java.util.ArrayList;

public class CustomList<E> extends ArrayList<E> {
	int getArrSize() {
		return super.elementData.length;
	}
}
