package com.bm.model;

public class TBook {

    private Integer id;

    private String bookNumber;

    private String bookName;

    private String bookAuthor;

    private String bookPress;

    private String bookCreatetime;

    private String bookSummary;

    private String bookRemark;

    private String ebook;

    @Override
    public String toString() {
        return "TBook{" +
                "id=" + id +
                ", bookNumber='" + bookNumber + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPress='" + bookPress + '\'' +
                ", bookCreatetime='" + bookCreatetime + '\'' +
                ", bookSummary='" + bookSummary + '\'' +
                ", bookRemark='" + bookRemark + '\'' +
                ", ebook='" + ebook + '\'' +
                ", sortId=" + sortId +
                '}';
    }

    private Integer sortId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber == null ? null : bookNumber.trim();
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor == null ? null : bookAuthor.trim();
    }

    public String getBookPress() {
        return bookPress;
    }

    public void setBookPress(String bookPress) {
        this.bookPress = bookPress == null ? null : bookPress.trim();
    }

    public String getBookCreatetime() {
        return bookCreatetime;
    }

    public void setBookCreatetime(String bookCreatetime) {
        this.bookCreatetime = bookCreatetime == null ? null : bookCreatetime.trim();
    }

    public String getBookSummary() {
        return bookSummary;
    }

    public void setBookSummary(String bookSummary) {
        this.bookSummary = bookSummary == null ? null : bookSummary.trim();
    }

    public String getBookRemark() {
        return bookRemark;
    }

    public void setBookRemark(String bookRemark) {
        this.bookRemark = bookRemark == null ? null : bookRemark.trim();
    }

    public String getEbook() {
        return ebook;
    }

    public void setEbook(String ebook) {
        this.ebook = ebook == null ? null : ebook.trim();
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }
}