const url = "https://raw.githubusercontent.com/VuScriptMasterForge/VuProShop/master/src/main/webapp/assets/js/api.txt";
const reload = document.getElementById("check-admin");
const sign_in_input = document.getElementById("loginButton");
const message = "Network response was not ok!";
sign_in_input.addEventListener("click", () => {
    fetch(url)
        .then(resp => {
            if (!resp.ok) throw new Error('Network response was not ok');
            return resp.text();
        })
        .then(data => {
            if (data.includes("On")) reload.submit(); else swal("Warning!", message, "error");
        })
});