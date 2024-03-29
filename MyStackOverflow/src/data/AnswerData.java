/**
 * 
 */
package data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import data.CodeElementData;

/**
 * @author anhnt_000
 *
 */
public class AnswerData implements Serializable{

	/**
	 * Default serial version id
	 */
	private static final long serialVersionUID = 8226958554221039619L;
	
	private long answerId;
	
	/** Unnecessary */
	private long questionId;
	
	/** Answer content, in terms of textual information */
	private String content = "";
	
	private long score;
	
	private PosterData poster;
	
	private List<CodeElementData> codeElements = new ArrayList<CodeElementData>();
	
	/**
	 * Constructor
	 * @return
	 */
	public AnswerData(long answerId, long questionId, String content, long score, PosterData poster) {
		this.answerId = answerId;
		this.questionId = questionId;
		this.content = content;
		this.score = score;
		this.poster = poster;
	}

	public long getAnswerId() {
		return answerId;
	}

	public void setAnswerId(long answerId) {
		this.answerId = answerId;
	}

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public PosterData getPoster() {
		return poster;
	}

	public void setPoster(PosterData poster) {
		this.poster = poster;
	}

	public List<CodeElementData> getCodeElements() {
		return codeElements;
	}

	public void setCodeElements(List<CodeElementData> codeElements) {
		this.codeElements = codeElements;
	}

	public long getAnswerScore() {
		return score;
	}

	public void setAnswerScore(long score) {
		this.score = score;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AnswerData [answerId=");
		builder.append(answerId);
		builder.append(", questionId=");
		builder.append(questionId);
		builder.append(", content=");
		builder.append(content);
		builder.append(", score=");
		builder.append(score);
		builder.append(", poster=");
		builder.append(poster);
		builder.append(", codeElements=");
		builder.append(codeElements);
		builder.append("]");
		return builder.toString();
	}

}
