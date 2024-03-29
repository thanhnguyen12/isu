/**
 * 
 */
package database;

/**
 * @author anhnt
 *
 */
public class PostRowData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	//	const column_spec posts_columns[] =
	//		{{"Id",             CT_INT},
	//		 {"PostTypeId",     CT_INT},
	//		 {"AcceptedAnswerId", CT_INT},
	//		 {"ParentId",       CT_INT},
	//		 {"CreationDate",   CT_DATE},
	//		 {"Score",          CT_INT},
	//		 {"ViewCount",      CT_INT},
	//		 {"Body",           CT_TEXT},
	//		 {"OwnerUserId",    CT_INT},
	//		 {"OwnerDisplayName",    CT_TEXT},
	//		 {"LastEditorUserId", CT_INT},
	//		 {"LastEditorDisplayName", CT_VCHR64},
	//		 {"LastEditDate",   CT_DATE},
	//		 {"LastActivityDate", CT_DATE},
	//		 {"Title",          CT_TEXT},
	//		 {"Tags",           CT_TEXT},
	//		 {"AnswerCount",    CT_INT},
	//		 {"CommentCount",   CT_INT},
	//		 {"FavoriteCount",  CT_INT},
	//		 {"ClosedDate",     CT_DATE},
	//		 {"CommunityOwnedDate", CT_DATE},
	//		 {0}};
	//
	//const table_spec posts_table = {"posts", posts_columns};
	
	public long id;
	public long postTypeId;
	public long AcceptedAnswerId;
	public long ParentId;
	public String creationDate;
	public long score;
	public long viewCount;
	public String body;
	public long ownerUserId;
	public String ownerDisplayName;
	public long lastEditorUserId;
	public String lastEditorDisplayName;
	public String lastEditDate;
	public String lastActivityDate;
	public String title;
	public String tags;
	public long answerCount;
	public long commentCount;
	public long favoriteCount;
	public String closedDate;
	public String communityOwnedDate;
	public PostRowData(long id, long postTypeId, long acceptedAnswerId,
			long parentId, String creationDate, long score, long viewCount,
			String body, long ownerUserId, String ownerDisplayName,
			long lastEditorUserId, String lastEditorDisplayName,
			String lastEditDate, String lastActivityDate, String title,
			String tags, long answerCount, long commentCount, long favoriteCount,
			String closedDate, String communityOwnedDate) {
		this.id = id;
		this.postTypeId = postTypeId;
		AcceptedAnswerId = acceptedAnswerId;
		ParentId = parentId;
		this.creationDate = creationDate;
		this.score = score;
		this.viewCount = viewCount;
		this.body = body;
		this.ownerUserId = ownerUserId;
		this.ownerDisplayName = ownerDisplayName;
		this.lastEditorUserId = lastEditorUserId;
		this.lastEditorDisplayName = lastEditorDisplayName;
		this.lastEditDate = lastEditDate;
		this.lastActivityDate = lastActivityDate;
		this.title = title;
		this.tags = tags;
		this.answerCount = answerCount;
		this.commentCount = commentCount;
		this.favoriteCount = favoriteCount;
		this.closedDate = closedDate;
		this.communityOwnedDate = communityOwnedDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PostRowData [id=");
		builder.append(id);
		builder.append(", postTypeId=");
		builder.append(postTypeId);
		builder.append(", AcceptedAnswerId=");
		builder.append(AcceptedAnswerId);
		builder.append(", ParentId=");
		builder.append(ParentId);
		builder.append(", creationDate=");
		builder.append(creationDate);
		builder.append(", score=");
		builder.append(score);
		builder.append(", viewCount=");
		builder.append(viewCount);
		builder.append(", body=");
		builder.append(body);
		builder.append(", ownerUserId=");
		builder.append(ownerUserId);
		builder.append(", ownerDisplayName=");
		builder.append(ownerDisplayName);
		builder.append(", lastEditorUserId=");
		builder.append(lastEditorUserId);
		builder.append(", lastEditorDisplayName=");
		builder.append(lastEditorDisplayName);
		builder.append(", lastEditDate=");
		builder.append(lastEditDate);
		builder.append(", lastActivityDate=");
		builder.append(lastActivityDate);
		builder.append(", title=");
		builder.append(title);
		builder.append(", tags=");
		builder.append(tags);
		builder.append(", answerCount=");
		builder.append(answerCount);
		builder.append(", commentCount=");
		builder.append(commentCount);
		builder.append(", favoriteCount=");
		builder.append(favoriteCount);
		builder.append(", closedDate=");
		builder.append(closedDate);
		builder.append(", communityOwnedDate=");
		builder.append(communityOwnedDate);
		builder.append("]");
		return builder.toString();
	}
	

}
