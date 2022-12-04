let user;
function save()
{
    let usrName = document.getElementById("name").value;
    let usrPpsn = document.getElementById("ppsn").value;
    let usrScore = document.getElementById("score").value;

    user = {Name: usrName, Ppsn: usrPpsn, creditScore: usrScore}
    console.log(user.Name + " " + user.Ppsn + " " + user.creditScore);
}


