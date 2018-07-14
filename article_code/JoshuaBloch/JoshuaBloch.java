private static void rangeCheck(int arrayLen, int fromIndex, int toIndex) {
	if(fromIndex > toIndex)
		throw new IllegalArgumentException("fromIndex("+ fromIndex +
		")> toIndex("+ toIndex+")");
	if(fromIndex < 0)
		throw new ArrayIndexOutOfBoundsException(fromIndex);
	if(toIndex > arrayLen)
		throw new ArrayIndexOutOfBoundsException(toIndex);
}
