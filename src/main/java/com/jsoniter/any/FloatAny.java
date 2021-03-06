package com.jsoniter.any;

import java.io.IOException;

import com.jsoniter.ValueType;
import com.jsoniter.output.JsonStream;

/**
 * 
 * @author MaxiBon
 *
 */
class FloatAny extends Any {

	private float val;

	/**
	 * FloatAny.
	 * 
	 * @param val
	 */
	FloatAny(float val) {
		this.val = val;
	}

	@Override
	public ValueType valueType() {
		return ValueType.NUMBER;
	}

	@Override
	public Object object() {
		return val;
	}

	@Override
	public boolean toBoolean() {
		return val != 0;
	}

	@Override
	public int toInt() {
		return (int) val;
	}

	@Override
	public long toLong() {
		return (long) val;
	}

	@Override
	public float toFloat() {
		return val;
	}

	@Override
	public double toDouble() {
		return val;
	}

	@Override
	public String toString() {
		return String.valueOf(val);
	}

	public Any set(float newVal) {
		this.val = newVal;
		return this;
	}

	@Override
	public void writeTo(JsonStream stream) throws IOException {
		stream.writeVal(val);
	}
}
