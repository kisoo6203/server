<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
    <table>
        <tr>
            <th>섭취일자</th>
            <th>식품코드</th>
            <th>식품명</th>
            <th>섭취량</th>
            <th>제공량</th>
            <th>총내용량</th>
            <th>탄수화물</th>
            <th>지방</th>
            <th>당류</th>
            <th>단백질</th>
            <th>칼로리</th>
        </tr>
        <c:forEach items="${MFOODS}" var="MF">
        <tr>
            <td>${MF.mf_date}섭취일자</td>
            <td>${MF.mf_fcode}식품코드</td>
            <td>${MF.mf_fname}식품명</td>
            <td>${MF.mf_amt}섭취량</td>
            <td>${MF.mf_once}제공량</td>
            <td>${MF.mf_capa}총내용량</td>
            <td>${MF.mf_carbo}탄수화물</td>
            <td>${MF.mf_fat}지방</td>
            <td>${MF.mf_sugar}당류</td>
            <td>${MF.mf_protein}단백질</td>
            <td>${MF.mf_cal}칼로리</td>
        </tr>
        </c:forEach>

    </table>

</body>
</html>