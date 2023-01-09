package com.java.functionalinterfaces;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierImpl implements Supplier<LocalDateTime> {
	@Override
	public LocalDateTime get() {
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
		System.out.println(supplier.get());
	}

}
