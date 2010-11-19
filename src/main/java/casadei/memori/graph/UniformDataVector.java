package casadei.memori.graph;

import java.util.Vector;

public class UniformDataVector <E> extends Graph {

	private Vector<E> data;
	private DataType dataType;
	private DataType.Handler dataHandler;


	public void addDataNode(E elem) {
		data.add(elem);
	}


	public int size() {
		return data.size();
	}

	class NodeMethods_UniformDataVector extends NodeMethods<Integer> {
		@Override
		public boolean isNode(Integer ni) {
			return false;
		}
		@Override
		public boolean isLeaf(Integer ni) {
			return false;
		}
		@Override
		public int getPhylum(Integer ni) {
			return -1;
		}
		@Override
		public int getGenus(Integer ni) {
			return -1;
		}
		@Override
		public Object getData(Integer ni) {
			return data.get(ni);
		}
		@Override
		public void print(Integer ni) {
			dataHandler.print(ni);
		}
		@Override
		public String toString(int ni) {
			return dataHandler.toString(ni);
		}
		
	}
	
	public UniformDataVector(DataType udt) {
		node = new NodeMethods_UniformDataVector();
		dataType = udt;
		dataHandler = udt.makeHandler(this);
		data = new Vector<E>();
	}


	public DataType getDataType() { return dataType; }


}