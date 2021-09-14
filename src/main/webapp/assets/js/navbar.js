document.querySelector("#navbar-custom .dropdown-toggle")
    .addEventListener("click", handleClickDropdown);

function handleClickDropdown(){
    let dropdownMenu = document.querySelector("#navbar-custom .dropdown-menu")
    console.log(dropdownMenu.style.display)
    if(dropdownMenu.style.display === "") {
        dropdownMenu.style.display = "block"
    }else if (dropdownMenu.style.display === "block") {
        dropdownMenu.style.display = ""
    }
}