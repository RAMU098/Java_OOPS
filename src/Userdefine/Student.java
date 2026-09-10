package Userdefine;

import java.util.Objects;

public class Student {
private int stuno;
public int getStuno() {
	return stuno;
}
public void setStuno(int stuno) {
	this.stuno = stuno;
}
public int getStumarks() {
	return stumarks;
}
public void setStumarks(int stumarks) {
	this.stumarks = stumarks;
}
private int stumarks;
@Override
public String toString() {
	//return "Student [stuno=" + stuno + ", stumarks=" + stumarks + "]";//to print values ,we are overiding by using tostring
	return"Welcome to java";
}
//for equals of 2 hash code
@Override
public int hashCode() {
	return Objects.hash(Integer.valueOf(stumarks), Integer.valueOf(stuno));
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return stumarks == other.stumarks && stuno == other.stuno;
}
}
