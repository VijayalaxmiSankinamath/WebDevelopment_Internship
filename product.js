let params = new URLSearchParams(window.location.search);

let name = params.get("name");
let price = params.get("price");
let img = params.get("img");

document.getElementById("title").textContent = name;
document.getElementById("price").textContent = "$" + price;
document.getElementById("main-img").src = img;

let colorImages = document.querySelectorAll(".color-img");

colorImages.forEach((img) => {
    img.addEventListener("click", () => {
        document.getElementById("main-img").src = img.src;
    });
});