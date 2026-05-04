let params = new URLSearchParams(window.location.search);

let titleEl = document.getElementById("title");
let priceEl = document.getElementById("price");
let mainImg = document.getElementById("main-img");

let name = params.get("name");
let price = params.get("price");
let img = params.get("img");

// fallback (important for real use)
titleEl.textContent = name || "Product";
priceEl.textContent = "$" + (price || "0");
mainImg.src = img || "white.jpg";

// color change
let colorImages = document.querySelectorAll(".color-img");

colorImages.forEach((item) => {
    item.addEventListener("click", () => {

        // image change
        mainImg.src = item.src;

        // text change
        titleEl.textContent = item.dataset.name;
        priceEl.textContent = "$" + item.dataset.price;

        // active border
        colorImages.forEach(i => i.classList.remove("active"));
        item.classList.add("active");
    });
});
let btn = document.querySelector(".btn");

btn.addEventListener("click", () => {
    alert("Product added to cart");
});