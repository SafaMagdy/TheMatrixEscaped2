package code.Queue;

import java.util.PriorityQueue;

import code.PreNode;

public class PrQ extends Queue{
	PriorityQueue<PreNode> pQueue;
	public PrQ() {
		pQueue= new PriorityQueue<PreNode>();
		
	}
	@Override
	public void enqueue(PreNode pn) {
		// TODO Auto-generated method stub
		pQueue.add(pn);
		
	}
	@Override
	public PreNode dequeue() {
		return pQueue.remove();
	}

}