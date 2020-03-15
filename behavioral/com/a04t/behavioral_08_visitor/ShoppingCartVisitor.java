package com.a04t.behavioral_08_visitor;

public interface ShoppingCartVisitor {
	int visit(Book book);

	int visit(Fruit fruit);
}