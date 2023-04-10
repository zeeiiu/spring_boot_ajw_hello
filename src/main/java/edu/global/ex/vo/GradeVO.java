package edu.global.ex.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*@Getter
@Setter
@NoArgsConstructor
@ToString
*/

@Data
@AllArgsConstructor

public class GradeVO {

	private int kor;
	private int eng;
	private int math;
//	private String grade;

	public int getTotal() {
		return kor + eng + math;
	}

	public double getAvg() {
		return (kor + eng + math) / 3.0;
	}

	public String getGrade() {

		String grade = "가";
		double avg = getAvg();

		if (avg >= 90) {
			
			grade = "수";
		} else if (avg >= 80) {
			grade = "가";
		}
		return grade;
	}

}
