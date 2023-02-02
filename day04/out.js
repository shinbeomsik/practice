function check_id() {
    id2 = document.getElementById('id')
    size = id.value.length
    if (size < 5) {
        div_tag = document.getElementById('result')
        div_tag.innerHTML = "<font color = red> 5글자 미만이므로 가입불가</font>"
    } else {
        div_tag.innerHTML = "<font color = green> 5글자 이상이므로 가입가능</font>"
    }
}