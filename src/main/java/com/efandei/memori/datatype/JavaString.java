package com.efandei.memori.datatype;

import com.efandei.memori.graph.Graph;

public class JavaString extends com.efandei.memori.graph.DataType{

	public static final JavaString INSTANCE = new JavaString ();
	
	private JavaString() {}
	

	@Override
	public int dataTypeInteger() {
		return -1;
	}

	@Override
	public String dataTypeName() {
		return "JavaString2";
	}

	@Override
	protected Handler makeHandler(Graph aGraph) {
		return new StringHandler(aGraph);
		/*
		 * ALTERNATIVE FORM WITH ANONYMOUS CLASS
		return new memori.graph.DataType.Handler(aGraph) {
			@Override
			public void print(int ni) {
				System.out.println(super.graph.intNode.getData(ni));
			}
		};
		*/
	};
	
	public class StringHandler extends com.efandei.memori.graph.DataType.Handler {
		
		public StringHandler(Graph aGraph) { super(aGraph); }
		
		@Override
		public void print(int ni) {
			System.out.println(super.graph.inode().getData(ni));
		}

		@Override
		public void printData(Object aString) {
			System.out.println((String) aString);
		}

		@Override
		public String toString(int ni) {
			return (String) super.graph.inode().getData(ni);
		}
		
	}
}
