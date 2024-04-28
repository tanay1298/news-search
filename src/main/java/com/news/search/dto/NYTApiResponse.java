package com.news.search.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class NYTApiResponse {
    @JsonProperty("status")
    private String status;

    @JsonProperty("response")
    private Response response;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public static class Response {
        @JsonProperty("docs")
        private List<Article> docs;

        @JsonProperty("meta")
        private Meta meta;

        public List<Article> getDocs() {
            return docs;
        }

        public void setDocs(List<Article> docs) {
            this.docs = docs;
        }

        public Meta getMeta() {
            return meta;
        }

        public void setMeta(Meta meta) {
            this.meta = meta;
        }
    }

    public static class Meta {
        @JsonProperty("hits")
        private int hits;

        @JsonProperty("offset")
        private int offset;

        @JsonProperty("time")
        private int time;

        public int getHits() {
            return hits;
        }

        public void setHits(int hits) {
            this.hits = hits;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }
    }

    public static class Article {
        @JsonProperty("abstract")
        private String abstractText;

        @JsonProperty("web_url")
        private String webUrl;

        @JsonProperty("snippet")
        private String snippet;

        @JsonProperty("lead_paragraph")
        private String leadParagraph;

        @JsonProperty("print_section")
        private String printSection;

        @JsonProperty("print_page")
        private String printPage;

        @JsonProperty("source")
        private String source;

        public String getAbstractText() {
            return abstractText;
        }

        public void setAbstractText(String abstractText) {
            this.abstractText = abstractText;
        }

        public String getWebUrl() {
            return webUrl;
        }

        public void setWebUrl(String webUrl) {
            this.webUrl = webUrl;
        }

        public String getSnippet() {
            return snippet;
        }

        public void setSnippet(String snippet) {
            this.snippet = snippet;
        }

        public String getLeadParagraph() {
            return leadParagraph;
        }

        public void setLeadParagraph(String leadParagraph) {
            this.leadParagraph = leadParagraph;
        }

        public String getPrintSection() {
            return printSection;
        }

        public void setPrintSection(String printSection) {
            this.printSection = printSection;
        }

        public String getPrintPage() {
            return printPage;
        }

        public void setPrintPage(String printPage) {
            this.printPage = printPage;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }
    }
}
