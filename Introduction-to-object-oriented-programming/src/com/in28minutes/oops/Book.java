package com.in28minutes.oops;

public class Book {
	private int numOfCopies;

	Book(int firstStock) {
		this.numOfCopies = firstStock;
	}

	public int getNumOfCopies() {
		if (this.numOfCopies <= 0) {
			System.out.println("재고가 없습니다.");
			return 0;
		}
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		if (numOfCopies > 0) {
			this.numOfCopies = numOfCopies;
		}
	}

	public void increaseCopies(int howMuch) {
		this.numOfCopies = this.numOfCopies + howMuch;
	}

	public void decreaseCopies(int howMuch) {
		this.numOfCopies = this.numOfCopies - howMuch;
	}
}
