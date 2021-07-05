package com.example.demo;

public class Pit {

	
		private int leftIndex;
		private int rightIndex;
		private int depth;
		private int deepestpoint;
		public int getLeftIndex() {
			return leftIndex;
		}
		public void setLeftIndex(int leftIndex) {
			this.leftIndex = leftIndex;
		}
		public int getRightIndex() {
			return rightIndex;
		}
		public void setRightIndex(int rightIndex) {
			this.rightIndex = rightIndex;
		}
		public int getDepth() {
			return depth;
		}
		public void setDepth(int depth) {
			this.depth = depth;
		}
		public int getDeepestpoint() {
			return deepestpoint;
		}
		public void setDeepestpoint(int deepestpoint) {
			this.deepestpoint = deepestpoint;
		}
		@Override
		public String toString() {
			return "Pit [leftIndex=" + leftIndex + ", rightIndex=" + rightIndex + ", depth=" + depth + ", deepestpoint="
					+ deepestpoint + "]";
		}
		
		
		
}
